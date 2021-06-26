import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class LockMe {

    //Inner class for customized exception
    public static class FileAlreadyExistsException extends Exception {
        FileAlreadyExistsException(String message) {
            super(message);
        }
    }

    static Scanner intScanner = new Scanner(System.in);

    //Prints welcome page
    public static void welcomePage() {
        System.out.println("-------------------------------------");
        System.out.println("Welcome to LockedMe.com.");
        System.out.println("Menus:");
        System.out.println("1. Show application detail information");
        System.out.println("2. File Operations");
        System.out.println("3. Exit");
    }

    //Prints detail information about this application
    private static void printDetail() {
        System.out.println("Welcome to LockedMe.com");
        System.out.println("Version: 1.0");
        System.out.println("Developer: Sherman Xu");
        System.out.println("sherman.xu@lockers.com");
    }

    //Check file directory inout, if valid print menu, else go back to main menu
    private static void fileOperation() {
        System.out.println("-------------------------------------");
        String dir = getDirectory();
        File fileDir = new File(dir);
        if (!fileDir.isDirectory()) {
            System.out.println("Invalid directory entered, return to main menu");
            return;
        }
        System.out.println("Valid directory entered.");
        boolean flag = true;
        while (flag) {
            try {
                printFileOperationMenu();
                int op = getUserChoice();
                switch (op) {
                    case 1:
                        retrieveFiles(fileDir);
                        break;
                    case 2:
                        try {
                            addFile(fileDir);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            removeFile(fileDir);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            searchFile(fileDir);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        fileDir = changeDirectory(fileDir);
                        break;
                    case 6:
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid entry.");
                        System.out.println("Please choose your operation: ");
                        op = intScanner.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry, please try again.");
                intScanner.next();
            }
        }

    }

    //Search for file in current directory based on user's input.
    private static void searchFile(File fileDir) throws Exception {
        String fileName = getFileNameInput();
        File targetFile = new File(fileDir.toString() + "\\" + fileName);
        if (targetFile.exists()) {
            System.out.println("File is found on current directory.");
        } else {
            throw new FileNotFoundException("No such file on current directory.");
        }
    }

    //Remove a file from current directory.
    private static void removeFile(File fileDir) throws Exception {
        String fileName = getFileNameInput();
        File fileToRemove = new File(fileDir.toString() + "\\" + fileName);
        if (fileToRemove.delete()) {
            System.out.println("File removed successfully.");
        } else {
            throw new FileNotFoundException("No such file under current directory.");
        }
    }

    //Create a file on current directory.
    private static void addFile(File filedir) throws Exception {
        String fileName = getFileNameInput();
        File newFile = new File(filedir.toString() + "\\" + fileName);
        if (newFile.exists()) {
            throw new FileAlreadyExistsException("File already exists in current directory.");
        } else {
            try {
                if (newFile.createNewFile()) {
                    System.out.println("File created successfully");
                } else {
                    System.out.println("Something went wrong, please try again.");
                }
            } catch (IOException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    //Get user's input for file name.
    private static String getFileNameInput() {
        Scanner fileNameScanner = new Scanner(System.in);
        System.out.println("Please enter name of file: ");
        return fileNameScanner.nextLine();
    }

    //Retrieve all files under current directory, return them as list in ascending order.
    private static void retrieveFiles(File fileDir) {
        List<String> files = Arrays.asList(fileDir.list());
        if (files.isEmpty()) {
            System.out.println("There are no files under current directory.");
            return;
        }
        Collections.sort(files);
        int numOfFiles = files.size();
        System.out.println("There are " + numOfFiles + " files under current directory.");
        for (int i = 1; i <= numOfFiles; i++) {
            System.out.println(i + " - " + files.get(i - 1));
        }
    }

    //Change working directory.
    private static File changeDirectory(File fileDir) {
        String newDir = getDirectory();
        File newFileDir = new File(newDir);
        if (!newFileDir.isDirectory()) {
            System.out.println("Invalid directory entered, current directory remain unchanged");
            return fileDir;
        } else {
            System.out.println("Valid directory entered. Directory updated");
            return newFileDir;
        }
    }

    //Get user's input for directory.
    private static String getDirectory() {
        System.out.println("Please enter a directory: ");
        Scanner dirScanner = new Scanner(System.in);
        return dirScanner.nextLine();
    }

    //Prints file operation menu.
    private static void printFileOperationMenu() {
        System.out.println("-------------------------------------");
        System.out.println("File operation menu");
        System.out.println("1. Retrieve file names from directory");
        System.out.println("2. Add a file.");
        System.out.println("3. Delete a file.");
        System.out.println("4. Search a file.");
        System.out.println("5. Change directory.");
        System.out.println("6. Exit to main menu.");

    }

    //Get user's operation choice.
    private static int getUserChoice() {
        System.out.println("Please choose your operation: ");
        return intScanner.nextInt();
    }

    public static void main(String[] args) {
        boolean flag = true;
        int op;
        while (flag) {
            welcomePage();
            try {
                op = getUserChoice();
                switch (op) {
                    case 1:
                        printDetail();
                        break;
                    case 2:
                        //TODO
                        fileOperation();
                        break;
                    case 3:
                        flag = false;
                        System.out.println("Thank you for your business.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid entry");
                        System.out.println("Please choose your operation");
                }
            } catch (Exception e) {
                System.out.println("Invalid entry, please try again.");
                intScanner.next();
            }
        }
    }
}
