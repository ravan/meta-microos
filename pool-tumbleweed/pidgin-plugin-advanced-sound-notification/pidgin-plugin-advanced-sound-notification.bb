SUMMARY = "Pidgin plugin adding sound notifications"
DESCRIPTION = "This plugin adds sounds for some sound notifications to Pidgin \
(e.g. 'Incoming Filetransfer' or 'Authentication requested')."
LICENSE = "GPL-2.0+"

PV = "1.2.1"

RPM_NAME = "pidgin-plugin-advanced-sound-notification-1.2.1-11.35.aarch64.rpm"
RPM_HASH = "7a08fa1ac27ec9c4b4c5ef8bb8fe082a791d49b7ce9d9b44ca2eb2f8b6f361eca4c92615a3dc78ff82a9ee969b2424d1bf45d50a2de29fe04506298e2e7a05e0"

RPROVIDES:${PN} += "pidgin-plugin-advanced-sound-notification"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpurple.so.0 \
pidgin"

inherit rpm
