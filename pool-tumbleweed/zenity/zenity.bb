SUMMARY = "GNOME Command Line Dialog Utility"
DESCRIPTION = "Zenity is a basic rewrite of gdialog, without the pain involved of \
trying to figure out commandline parsing.  Zenity is zen-like; simple \
and easy to use. \
 \
Zenity Dialogs: Calendar, Text Entry, Error, Informational, File \
Selection, List, Progress, Question, Text Information, Warning and \
Password. \
 \
Zenity is especially useful in scripts."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.2"

RPM_NAME = "zenity-4.2.2-1.3.aarch64.rpm"
RPM_HASH = "9f3320634758ee9bbd046a2409caac4b3098073287764ccb5b3f59b91d47df55090080fd2fafc8f70fa310ca0d278b8f27678e27e93a631625cd4785c9ea8b10"

RPROVIDES:${PN} += "zenity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
