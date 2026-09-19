SUMMARY = "Task and project manager"
DESCRIPTION = "Planify is here... \
 \
    🚀️ Neat visual style. \
    🤚️ Drag and Order: Sort your tasks wherever you want. \
    💯️ Progress indicator for each project. \
    💪️ Be more productive and organize your tasks by 'Sections'. \
    📅️ Visualize your events and plan your day better. \
    ⏲️ Reminder system, you can create one or more reminders, you decide. \
    🌙️ Better integration with the dark theme. \
    🎉️ and much more. \
 \
☁️ Support for Todoist & Nextcloud: \
 \
    Synchronize your Projects, Tasks and Sections. \
    Support for Todoist offline: Work without an internet connection; when everything is reconnected, it will be synchronized. \
    Planify is not created by, affiliated with, or supported by Doist \
 \
💎️ Other features: \
 \
    ⏲️ Reminders notifications. \
    🔍️ Quick Find. \
    🌙️ Night mode. \
    🔁️ Recurring due dates."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.5"

RPM_NAME = "planify-4.19.5-1.1.aarch64.rpm"
RPM_HASH = "70d790f65ec62b3f4822fe6d0506833e17e93ab074466cbd033ff0512c9de3471a75417c99c5d1f909e09aa3c824af45842691dfd84104ba0179ccf9bee3d303"

RPROVIDES:${PN} += "elementary-planner \
pantheon-planner \
planify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libical-glib.so.3 \
libicuuc.so.78 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libplanify.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libsoup-3.0.so.0 \
libspelling-1.so.2 \
libsqlite3.so.0"

inherit rpm
