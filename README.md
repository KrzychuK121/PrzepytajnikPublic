# Przepytajnik

Simple desktop Java application for students. This program allows user to create sets of tests. Later user can use these tests to learn by reviewing it or by answerig it.

## How to run the program

*(description here)*

## About

**Short description**

Before user starts using the program, the program asks for selecting file. If file does not exists then new file will be created. It will be empty so user can write its content. If the file is not empty then program will load its content for future use. User has options to tests himself *(if there is content inside of the file)*, modify the file, check what's inside and change the file he is working on.

**Main features:**

* Available options
  - Testing - User have to write english word for word displayed on the screen in polish. Program stops when user answers every question and then displays mark based on content inside *domyslny.txt* file
  - Edit - Divided into two sections: modifying using simple form and using textarea editor. When using textarea editor, the program checks if it's right with standard <code>polish word;english word</code>. The form option contains another division: adding and deleting. To delete the row user has to enter the number of the row in the text field. To add new row user have to enter polish and english words in the text fields. User can also save changes locally without saving to file or save changes locally and directly to file
  - Review content - Displays two columns of dictionarys content. There are two buttons under the list of words *(polish - english)* which can be used to change displayed page
  - Change file - Close opened windows and displayed starter window showing text field for file name and list of available files ready to use
* Syntax verification while editing dictionary file *(set of tests)* - based on examining if file follows syntax standard <code>polish word;english word</code>. Otherwise the program selects wrong line so user can change it faster.
* Checking if files inside <code>Slowniki</code> directory are consistent with standard <code>polish word;english word</code> and then displaying them on files list ready to work. Text field has the same checking system. It will not allow user to open file inconsistent with the standard.
* Responsive windows
* Changing font to one of 3 variants while resizing the window *(need little fixing)*
* Closing every windows while changing file user is working on.

## Future program description

**Short description**

Application allows using application **offline** and **online** by many schools and users. **Offline** version enable user to work with files saved on computer and to log into the application as one of two available account: **teacher** and **student**. **Online** version permit user to log in with his personal account. Then he can do what he is authorized to, like: managing sets of tests, managing accounts or check students marks. This application is created for students, teachers and parents.
