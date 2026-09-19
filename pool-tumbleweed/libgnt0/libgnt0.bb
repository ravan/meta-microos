SUMMARY = "TUI Toolkit based on GLib and ncurses"
DESCRIPTION = "GNT is an ncurses toolkit for creating text-mode graphical user \
interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "2.14.4"

RPM_NAME = "libgnt0-2.14.4-1.10.aarch64.rpm"
RPM_HASH = "4c3c0bb570903d346705685a4e3e01403ccb37ec0d02e1becce0a93a04c48e9f9f6e9ecd0f518645e444f1d3eb38b28618a57e58b918b25ffabf4c6bf09cee8b"

RPROVIDES:${PN} += "libgnt.so.0 \
libgnt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
libxml2.so.16"

inherit rpm
