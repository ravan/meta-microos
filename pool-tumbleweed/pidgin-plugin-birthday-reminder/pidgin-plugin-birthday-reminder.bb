SUMMARY = "Pidgin plugin to remind you of the birthdays of your buddies"
DESCRIPTION = "Pidgin Birthday Reminder reminds you of your buddies birthdays. \
Birthdays can be set by hand or be automatically filled-in for ICQ, \
Skype and XMPP protocols."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "pidgin-plugin-birthday-reminder-1.13-1.16.aarch64.rpm"
RPM_HASH = "bf267757d2ff0a49f69ae1944052ea89f0b209ba2cfb40863ab7479a6adadbc0d4e8fe3bfcfe1e3d9afbf99f05c94f06ed75f7fbf63d272b584a4c407da52720"

RPROVIDES:${PN} += "pidgin-birthday-reminder \
pidgin-plugin-birthday-reminder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpurple.so.0 \
pidgin"

inherit rpm
