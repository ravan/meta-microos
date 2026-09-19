SUMMARY = "Library to identify wacom tablets"
DESCRIPTION = "libwacom is a library to identify graphics tablets and their model-specific \
features. It provides easy access to information such as 'is this a built-in \
on-screen tablet', 'what is the size of this model', etc. The name libwacom is \
historical - it was originally developed for Wacom devices only but now \
supports any graphics tablet from any vendor."
LICENSE = "HPND"

PV = "2.19.1"

RPM_NAME = "libwacom9-2.19.1-1.1.aarch64.rpm"
RPM_HASH = "120c8409bc614520625eb6ccef86cd565c48060a94f1934d4ca2c660f6df6e39d5aac52c16f2b741aaf46869066a96232cbc3837320c4a9fa8f8a148e1c38d35"

RPROVIDES:${PN} += "libwacom.so.9 \
libwacom9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libwacom-data"

inherit rpm
