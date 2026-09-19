SUMMARY = "A to-do list with built-in productivity timer"
DESCRIPTION = "Go For It! keeps track of tasks and assists in processing \
them subsequently. The timer avoids distraction by keeping the user's \
focus on the recent task, while issuing reminders to take short breaks \
on a regular basis."
LICENSE = "GPL-3.0"

PV = "1.6.3"

RPM_NAME = "go-for-it-1.6.3-1.40.aarch64.rpm"
RPM_HASH = "41f67419e5b0d70a27047fe3255e08952e60aa5add096f5610e7b5179b8713131e5eaeda4a75facb3dcb80f177924abfe38a315f4bcb41e66a922294b159cf92"

RPROVIDES:${PN} += "go-for-it"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4"

inherit rpm
