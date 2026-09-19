SUMMARY = "Text-Based User Interface for Pidgin Instant Messaging Client"
DESCRIPTION = "A text-based user interface to use with libpurple. This can be run \
from a standard text console or from a graphical terminal emulator. \
It uses ncurses and our homegrown gnt library for drawing windows \
and text."
LICENSE = "GPL-2.0-only"

PV = "2.14.14"

RPM_NAME = "finch-2.14.14-2.3.aarch64.rpm"
RPM_HASH = "916673bfd124eb5fb2375394bc240cd0a86e1c4049a0b131cf465fd9219f4582cecd1aa0d0b6a3f0b87f84b7eaa0393ca82016310d915e6f83e27d370e7f6b5d"

RPROVIDES:${PN} += "finch"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libgnt.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libncursesw.so.6 \
libpurple \
libpurple.so.0 \
libtinfo.so.6"

inherit rpm
