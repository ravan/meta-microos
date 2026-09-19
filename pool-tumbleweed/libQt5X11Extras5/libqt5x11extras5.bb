SUMMARY = "Qt 5 X11 Extras Addon"
DESCRIPTION = "Qt X11 Extras enables the Qt programmer to write applications for the \
Linux/X11 platform. (Applications developed with Qt can also be \
deployed across several other desktop and embedded operating systems \
without having to rewrite the source code.)"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5X11Extras5-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "acae482f8267a11ae6ad3b39dc2240ed2ed90b2fb61d234e872dea66a225fbece9ddcf8fa1b813b2774031b4f62e5a09b3ae5fbc44b2c2a33739374819e6a65c"

RPROVIDES:${PN} += "libQt5X11Extras.so.5 \
libQt5X11Extras5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6"

inherit rpm
