---
layout: page
title: User Guide
---
![Banner](images/banner.png)

## <u>Introduction</u>

Dash is a personal planner app which offers unparalleled speed using text-based input. It supports both management of
tasks and contacts. Dash is tailored to the needs of university students, who must keep track of a slew of different 
deadlines, commitments, and contacts. So long as you're a fast typist, Dash provides a blisteringly quick way to stay 
on top of your responsibilities.

This guide was written to help you set up and start using Dash. If you're a new user, the Quick Start guide has all you 
need to get started. If you're an intermediate user looking to get more out of Dash, all supported commands are listed 
below.

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## <u>How to use this User Guide</u>

* Go to the [Getting Started](#getting-started) section for an overview of Dash.
* If you want to dive straight into features, you can check out our [Features](#features) section.
* For a quick recap of the commands, you can take a look at our [Command Summary](#command-summary) section.
* If you're looking for something specific, a [Table of Contents](#table-of-contents) with clickable links to each 
  section is provided. 

<div markdown="block" class="alert alert-info">

**Here's the meaning of some icons we used in the guide:**<br>

:information_source: Extra information about the specific section.

:warning: Important information to help you avoid errors.

:bulb: Tips to help you get the most out of Dash.

</div>

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## <u>Table of Contents</u>

* Table of Contents
{:toc}

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## <u>Setting up Dash</u>

On most modern operating systems like Windows or macOS, the steps for installation are the same.

1. Ensure you have Java `11` or above installed in your Computer. 
   [Not sure what Java is? Click here!](https://java.com/en/download/help/download_options.html)

2. Download the latest `dash.jar` from [this website](https://github.com/AY2122S1-CS2103T-W15-2/tp/releases/tag/v1.4).

3. Put the `dash.jar` file in the folder you want to use as the _home folder_ for Dash. This is where your data will 
   be stored.
   -  _We suggest creating a folder called "Dash" and putting the `dash.jar` file inside it. You can place this folder 
      wherever you want. Next, we recommend that you create a shortcut for Dash by right-clicking on the `dash.jar` 
      file. On Windows, click on the `Create Shortcut` option while on macOS, click on `Make Alias`. You can then put 
      this shortcut in a convenient place (such as your Desktop) for easy access._


4. Double-click the file to start the app. Here's what you should see in a few seconds:<br>
   ![Ui](images/UG-00.png)
   
5. That's all you need to do for the setup. To get started writing commands, refer to the Getting Started section 
   [below](#getting-started).

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## <u>Getting Started</u>

### <u>Overview</u>

Dash supports contact and task management in several ways. 

In terms of contact management, Dash allows you to add contacts and fill in details such as their 
phone number, address, and email. 
It even allows you to group them using tags such as "Neighbour" or "Colleague", so you can look them up more easily. 

For task management, Dash allows you to add tasks, tag them, and set deadlines for them. 
Once you're done with a task, you can mark it as complete. 
You can view a list of your incomplete tasks sorted by their due date so that you can prioritise the most pressing 
deadlines.

[[Back to Table of Contents]](#table-of-contents)

<div style="page-break-after: always;"></div>

### <u>Tab System</u>

![Switching Tabs](images/UG-01.png)

The image above shows the tab system of Dash, which allows it to keep your contacts and tasks separate.
To view and edit your contact list, you must switch to the contacts tab.
Similarly, to view and edit your task list, you must switch to the tasks tab.
Finally, the help tab provides you with a quick summary of Dash's features and how to use them.

[[Back to Table of Contents]](#table-of-contents)

<div style="page-break-after: always;"></div>

### <u>Command Line Interface</u>

Dash uses a Command Line Interface (CLI) to optimize speed. This means that instead of using your mouse to click 
through menus, you mostly use your keyboard to interact with Dash by typing in **commands**. 

**Commands** are how you tell Dash to do things. The first word you type in is the **command word** which lets Dash 
know what kind of command you are inputting. Some types of commands require other inputs after the first word: these 
are known as **arguments**. These arguments are usually made up of a **prefix** and a **parameter**. 

In the example below, the command word is `add`, and the argument `n/Alice Yeoh` is made up of the prefix `n/` and the 
parameter `Alice Yeoh`. This tells Dash to add a contact with name `Alice Yeoh`.

```aidl
add n/Alice Yeoh
```

To execute the command, simply type `add n/Alice Yeoh` in the command box and press enter.

The format of each command must be followed precisely, or the command won't work.

If you're a beginner user, you might get the command format wrong. That's ok! Your input simply won't be recognised by
Dash, and will remain in the command box. You can then modify your input and press Enter to try to execute the
command again.

Here are more example commands you can try:

* **`help`** : Switches to the help tab

* **`tasks`** : Switches to the tasks tab

* **`exit`** : Exits the app.

You can find the details of all commands in the [Features section](#features) below.

<div markdown="block" class="alert alert-info">

:bulb: You can press the up and down arrow keys in the command box to retrieve your 10 previous commands. This can save 
you a lot of time!

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## <u>Features</u>

<div markdown="block" class="alert alert-info">

<a name="command-format-info"></a>
**:information_source: Notes about the command format:**<br>

Here's how to read the given command formats:

* Words in `UPPER_CASE` denote parameters.<br>
  e.g. If the format is `add n/NAME`, `NAME` is a parameter which should be replaced by the name of the contact you 
  want to add.

* Arguments in square brackets are optional.<br>
  e.g. If the format is `add n/NAME [t/TAG]`, since `TAG` is optional, both `add n/John Doe t/friend` and 
  `add n/John Doe` are accepted by Dash. However, since `NAME` is not optional, `add t/friend` is not accepted.

* Arguments with `…` after them can be used more than once.<br>
  e.g. If the format is `tag t/TAG...` can be used as `tag t/friend`, `tag t/friend t/colleague`, `tag t/friend t/colleague t/boss` 
  etc.<br>
  
**Here's the meaning of some icons used in this section:**

:orange_book: Brief description of what the command does.

:camera: Explanation of included screenshots.

:page_with_curl: Format of the command. Refer to the [command format notes](#command-format-info) above for more 
information.

:scroll: Notes on the command behavior, with relevant examples.

</div>

<div style="page-break-after: always;"></div>

### <u>General</u>

#### Switch Tabs: `contacts` or `tasks` or `help`

:orange_book: If you want to switch to a certain tab, you can do that by typing out the tab name.

:page_with_curl: Format: `contacts` or `tasks` or `help`

Alternatively, you can switch tabs using shortcuts to save time:

:page_with_curl: Format: `c` or `t` or `h`

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Exiting the program: `exit`

:orange_book: If you want to close the window and exit the program, you can use the _Exit_ command.

:page_with_curl: Format: `exit`

<div markdown="block" class="alert alert-info">

:bulb: You can exit the app at any time by using the exit command or by closing the window. Your progress will always
be saved.

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

### <u>Contacts</u>

<div markdown="block" class="alert alert-info">

**:warning: Command behaviour:**
Make sure you switch to the Contacts tab before using these commands! They will not work otherwise.

</div>

#### Adding a contact: `add`

![Adding a Contact](images/UG-02.png)

:orange_book: If you want to add a person to the contact list, you can use the _Add_ command. Only the contact's name 
is compulsory during creation. 

:camera: The above screenshot shows how you can use the _Add_ command to add a person with the following details to 
your contact list:

* Name: _Mitski Miyawaki_
* Phone number: _91288841_
* Email address: _mitski@example.com_
* Address: _1 Hougang Street 91, #01-41_
* Tag(s): _friend_

:page_with_curl: Format: `add n/NAME [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`

<div style="page-break-after: always;"></div>

<div markdown="block" class="alert alert-info">

**:information_source: Name limitations:**<br>
Names must be unique, and should be no longer than 30 characters.

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Editing contact details: `edit`

![Editing a Contact](images/UG-04.png)

:orange_book: If you want to modify the details of a specific contact, you can use the _Edit_ command.

:camera: The above screenshot shows how the _Edit_ command can be used to edit the phone number and email of a contact.

:page_with_curl: Format: `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`

:scroll: Notes:

* At least one of the optional arguments must be provided.
* Edits the contact at the specified `INDEX`.
  * The `INDEX` refers to the position of the contact in the displayed contact list as indicated by the number next to 
  their name.
* Existing details will be updated using the supplied parameters.
* When editing tags, the existing tags of the contact will be removed.
  * To add tags without removing existing tags, refer to the Tag command in the [next section](#tagging-a-contact-tag).

<div markdown="block" class="alert alert-info">

**:information_source: Name limitations:**<br>
Names must be unique, and should be no longer than 30 characters.

</div>
  
<div markdown="block" class="alert alert-info">

:bulb: You can remove all tags from a contact by typing `edit INDEX t/`.

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------
#### Tagging a contact: `tag`

![Tagging a Contact](images/UG-12.png)

:orange_book: If you want to add new tags to a contact without replacing the old ones, you can use the _Tag_ command.

:camera: The above screenshot shows how the _Tag_ command can be used to tag a contact with the tag "groupmate".

:page_with_curl: Format: `tag INDEX t/TAG...`

:scroll: Notes:

* At least one tag must be provided.

<div style="page-break-after: always;"></div>

<div markdown="block" class="alert alert-info">

**:information_source: Tag limitations:**<br>
Tags should be no longer than 15 characters.

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Deleting a contact: `delete`

:orange_book: If you want to delete a contact, you can use the _Delete_ command.

:page_with_curl: Format: `delete INDEX`

:scroll: Notes:

* Deletes the person at the specified `INDEX`.
  * The `INDEX` refers to the position of the contact in the displayed contact list as indicated by the number next to
    their name.
    
[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Finding all contacts matching given details: `find`

![Finding a Contact](images/UG-06.png)

:orange_book: If you want to filter your contacts by tags, names, or any other details, you can use the _Find_ command.

:camera: The above screenshot shows how the _Find_ command can be used to search for all contacts who are tagged as 
"friends".

:page_with_curl: Format: `find [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`

:scroll: Notes:

* At least one of the optional fields must be provided.
* The search is case-insensitive. e.g. `find e/hans@gmail.com` will match `Hans@gmail.com`.
* The order of the keywords does not matter. e.g. `find a/tampines 111` will match `Blk 111 Tampines Street 11, #02-345`.

<div markdown="block" class="alert alert-info">

:bulb: For added convenience, you can find contacts by their names by typing just `find NAME` without the prefix `n/`.

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Listing all contacts: `list`

:orange_book: After you’ve filtered your contacts using 
[the _Find_ command](#finding-all-contacts-matching-given-details-find), if you want to view all of them again, you can 
use the List command.

:page_with_curl: Format: `list`

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Clearing all contacts: `clear`

:orange_book: If you want to delete all of your contacts, you can use the _Clear_ command.

:page_with_curl: Format: `clear`

<div markdown="block" class="alert alert-info">

**:warning: Clearing all contacts:**<br>
This command is **irreversible** and your contact list will be **permanently** deleted.  

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

### <u>Tasks</u>

<div markdown="block" class="alert alert-info">

**:warning: Command behaviour:**
Make sure you switch to the Tasks tab before using these commands! They will not work otherwise.

<a name="contacts-panel-info"></a>
**:information_source: Notes on the Contacts panel:**
On the Tasks tab, there is a Contacts panel on the right that shows a simplified view of your Contacts tab. If you 
filtered your contacts by using the _Find_ command before switching to the Tasks tab, the Contacts panel shows the same 
filtered contact list. In this way, if you have a lot of contacts, you can maintain a focused view of the current people
of interest and more easily assign them to tasks.

</div>

#### Adding a task: `add`

![Adding a Task](images/UG-03.png)

:orange_book: If you want to add a task to the task list, you can use the _Add_ command. Only task's description is 
compulsory during creation. 

:camera: The above screenshot shows how you can use the _Add_ command to add a task with the following details to your 
task list:

* Description: _Submit PR_
* Date and Time: _1 Nov 2021, 5:00 PM_
* Tag(s): _Groupwork_
* Assigned Person(s): _Alex Yeoh_

:page_with_curl: Format: `add d/DESCRIPTION [dt/DATE] [dt/TIME] [dt/DATE, TIME] [p/PERSON_INDEX]... [t/TAG]...`

:scroll: Notes:

* If you want to assign people to the task, the people to be assigned to the task (assignees) are specified with
  `PERSON_INDEX`.  
  * You can assign multiple people to the same task at once.
  * The `PERSON_INDEX` refers to the position of the person in the
    [Contacts panel](#tasks-info) as indicated by the number next to their name.
* An explanation of how Date and Time formats work can be found [here](#date-time-info).

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Editing task details: `edit`

![Editing a Task](images/UG-05.png)

:orange_book: If you want to modify the details of a specific task, you can use the _Edit_ command.

:camera: The above screenshot shows how the _Edit_ command can be used to edit the Date, Time and assignee of a task.

:page_with_curl: Format: `edit INDEX [d/DESCRIPTION] [dt/DATE] [dt/TIME] [dt/DATE, TIME] [p/PERSON_INDEX]... [t/TAG]...`

:scroll: Notes:

* At least one of the optional fields must be provided.
* Edits the task at the specified `INDEX`.
  * The `INDEX` refers to the position of the task in the displayed task list as indicated by the number next to 
  its description.
* Existing details will be updated using the supplied parameters.
* When editing tags, the existing tags of the contact will be removed.
  * To add tags without removing existing tags, refer to the Tag command in the [next section](#tagging-a-task-tag).
* If you want to modify the assignees of the task, new assignees are specified with `PERSON_INDEX`.
  * You can assign multiple people to the same task at once.
  * The `PERSON_INDEX` refers to the position of the person in the [Contacts panel](#contacts-panel-info) as indicated 
    by the number next to their name.
* An explanation of how Date and Time formats work can be found [here](#date-time-info).

<div markdown="block" class="alert alert-info">

:bulb: You can remove all tags from a task by typing `edit INDEX t/`.

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Tagging a task: `tag`

![Tagging a Task](images/UG-8.png)

:orange_book: If you want to add more tags to a task without replacing the old tags, you can use the _Tag_ command.

:camera: The above screenshot shows how the _Tag_ command is used to add the tag "urgent" to the task "Submit CS2100 Assignment
by 23:59".

:page_with_curl: Format: `tag INDEX t/TAG...`

:scroll: Notes:

* At least one tag must be provided.

<div markdown="block" class="alert alert-info">

**:warning: Tag Limitations:**<br>
Tags should be no longer than 15 characters.

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Assigning people to a task: `assign`

![Assigning people to a Task](images/UG-9.png)

:orange_book: If you want to assign more people to a task without replacing the old assignees, you can use the _Assign_ 
command.

:camera: The above screenshot shows how the _Assign_ command is used to assign "Alex Yeoh" to the task "Submit CS2100 Assignment
by 23:59". 

:page_with_curl: Format: `assign INDEX p/PERSON_INDEX...`

:scroll: Notes:

* Assigns people, specified with `PERSON_INDEX`, to the task at the specified `INDEX`.
  * At least one person must be provided.
  * You can assign multiple people to the same task at once.
  * The `INDEX` refers to the position of the task in the displayed task list as indicated by the number next to its 
    description.
  * The `PERSON_INDEX` refers to the position of the person in the
    [Contacts panel](#contacts-panel-info) as indicated by the number next to their name.

[[Back to Table of Contents]](#table-of-contents)
  
--------------------------------------------------------------------------------------------------------------------

#### Completing a task: `complete`

![Completing a Task](images/UG-10.png)

:orange_book: If you have completed a task, you can mark it as completed by using the _Complete_ command.

:camera: The above screenshot shows how a completed task has its text greyed out and has a green tick next to its description. 
An incomplete task has a red tick instead.

:page_with_curl: Format: `complete INDEX`

:scroll: Notes:

* Completes the task at the specified `INDEX`.
  * The `INDEX` refers to the position of the task in the displayed task list as indicated by the number next to its 
    description.
* You cannot 'un-complete' a task. 

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Deleting a task: `delete`

:orange_book: If you want to delete a task, you can use the _Delete_ command.

:page_with_curl: Format: `delete INDEX`

:scroll: Notes:

* Deletes the task at the specified `INDEX`.
  * The `INDEX` refers to the position of the task in the displayed task list as indicated by the number next to 
    its description.

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Finding all tasks matching given details: `find`

![Finding a Task](images/UG-07.png)

:orange_book: If you want to filter your tasks by tags, assigned people, or any other details, 
you can use the _Find_ command.

:camera: The above screenshot shows how the _Find_ command can be used to search for all tasks marked "07:00 PM".

:page_with_curl: Format: `find [d/DESCRIPTION] [dt/DATE] [dt/TIME] [dt/DATE, TIME] [c/COMPLETION_STATUS] 
[p/PERSON_INDEX]... [t/TAG]...`

:scroll: Notes:

* At least one of the optional fields must be provided.
* The search is case-insensitive. e.g `find t/HOMEWORK` will match the `homework` tag.
* The order of the keywords does not matter. e.g. `find d/lectures ST` will match `ST Lectures`.
* `COMPLETION_STATUS` must be either `true` (for completed tasks) or `false` (for incomplete tasks).
  It will not return tasks with different times, even if they both have the tag `homework`.
* An explanation of how Date and Time formats work can be found [here](#date-time-info).

<div markdown="block" class="alert alert-info">

:bulb: For added convenience, you can find tasks by their descriptions by typing just `find DESCRIPTION` 
without the prefix `d/`.

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Viewing all upcoming tasks: `upcoming`

![Viewing upcoming Tasks](images/UG-11.png)

:orange_book: If you want to view all of your upcoming tasks, you can use the _Upcoming_ command. Upcoming tasks are
incomplete tasks whose Date/Time are after the current Date/Time.

:camera: The above screenshot shows how the _Upcoming_ command is used to view all incomplete tasks after the current 
Date/Time. In this example, it was 25 October 2021, 09:16 PM.


:page_with_curl: Format: `upcoming`

:scroll: Notes:

* Filters your task list so that upcoming tasks will be listed in chronological order.
* The current Date/Time is determined locally by your system clock.

<div markdown="block" class="alert alert-info">

:bulb: This command will reorder your task list, even after you remove the filter with 
[the _List_ command](#listing-all-tasks-list).
Completed tasks will appear first, so it's convenient to use 
[the _Cleardone_ command](#clearing-completed-tasks-cleardone) next!

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Listing all tasks: `list`

:orange_book: After you’ve filtered your tasks using 
[the _Find_ command](#finding-all-tasks-matching-given-details-find) or 
[the _Upcoming_ command](#viewing-all-upcoming-tasks-upcoming), if you want to view all of them again, you can
use the List command.

:page_with_curl: Format: `list`

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Clearing completed tasks: `cleardone`

:orange_book: If you want to delete all of your completed tasks, you can use the _Cleardone_ command.

:page_with_curl: Format: `cleardone`

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

#### Clearing all tasks: `clear`

:orange_book: If you want to delete all of your tasks, you can use the _Clear_ command.

:page_with_curl: Format: `clear`

<div markdown="block" class="alert alert-info">

**:warning: Clearing all tasks:**<br>
This command is **irreversible** and your task list will be **permanently** deleted.

</div>

[[Back to Table of Contents]](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

<div markdown="block" class="alert alert-info">

<a name="date-time-info"></a>
**:information_source: Notes about specifying Date and Time:**
A task can optionally have a Date, or both a Date and a Time.

`add [dt/DATE] [dt/TIME] [dt/DATE, TIME]`

* When only Date is specified in the _Add_ command, a task will only have the specified Date.
* When only Time is specified in the _Add_ command, a task will have today's Date and the specified Time.
* When both Date and Time are specified in the _Add_ command, a task will have both of the specified Date and Time.

`edit [dt/DATE] [dt/TIME] [dt/DATE, TIME]`

* When only Date is specified in the _Edit_ command, a task will only have its Date changed to the specified Date.
* When only Time is specified in the _Edit_ command, a task will only have its Time changed to the specified Time.
* When both Date and Time are specified in the _Edit_ command, a task will have both of its Date and Time changed to the specified Date and Time.

**:warning: Multiple Date/Time parameters:**<br>
All commands that accept Date/Time parameters (_Add_, _Edit_, _Find_ commands) expect only one Date/Time parameter. 
If you specify multiple Date/Time parameters, only the last Date/Time parameter will be taken.<br>
e.g. if you specify `dt/12/02/2021 dt/1900`, only `dt/1900` will be taken.

<div style="page-break-after: always;"></div>

**Date Formats**

Format | Example
--------|------------------
**dd/MM/yyyy** | `02/10/2021`
**dd-MM-yyyy** | `02-10-2021`
**yyyy/MM/dd** | `2021/10/02`
**yyyy-MM-dd** | `2021-10-02`
**dd MMM yyyy** | `02 Oct 2021` (First letter of Month must be capitalised)

**Time Formats**

Format | Example
--------|------------------
**HHmm** | `1300` (01:00 PM in 24-hour notation)
**hh:mm a** | `10:00 PM`, `02:00 AM` (AM and PM must be capitalised)

</div>

<div style="page-break-after: always;"></div>

## <u>Command summary</u>

### General

Action | Format
--------|------------------
**Contacts** | `contacts` or `c`
**Tasks** | `tasks` or `t`
**Help** | `help` or `h`
**Exit** | `exit`

[[Back to Table of Contents]](#table-of-contents)

### Contacts Tab

Action | Format
--------|------------------
**Add** | `add n/NAME [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`
**Edit** | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`
**Tag** | `tag INDEX t/TAG...`
**Delete** | `delete INDEX`
**Find** | `find [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]...`
**List** | `list`
**Clear** | `clear`

<div style="page-break-after: always;"></div>

### Tasks Tab

Action | Format
--------|------------------
**Add** | `add d/DESCRIPTION [dt/DATE] [dt/TIME] [dt/DATE, TIME] [p/PERSON_INDEX]... [t/TAG]...`
**Edit** | `edit INDEX [d/DESCRIPTION] [dt/DATE] [dt/TIME] [dt/DATE, TIME] [p/PERSON_INDEX]... [t/TAG]...`
**Tag** | `tag INDEX t/TAG...`
**Assign** | `assign INDEX p/PERSON_INDEX...`
**Complete** | `complete INDEX`
**Delete** | `delete INDEX`
**Find** | `find [d/DESCRIPTION] [dt/DATE] [dt/TIME] [dt/DATE, TIME] [c/COMPLETION_STATUS] [p/PERSON_INDEX]... [t/TAG]...`
**Upcoming** | `upcoming`
**List** | `list`
**Clear Done** | `cleardone`
**Clear** | `clear`

[[Back to Table of Contents]](#table-of-contents)
