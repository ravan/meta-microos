SUMMARY = "A GUI text editor"
DESCRIPTION = "NEdit is a GUI style plain text editor for workstations with the X Window System \
and Motif. NEdit provides all of the standard menu, dialog, editing, \
mouse support, macro extension language, syntax highlighting, \
and a lot other nice features (and extensions for programmers)."
LICENSE = "GPL-2.0-or-later"

PV = "5.7"

RPM_NAME = "nedit-5.7-4.7.aarch64.rpm"
RPM_HASH = "7d5a7c61b744b7f4f1fccf96148ec96046b72c44bbf69ccf6fde0e972f088be6488b3097447bdc809f2c791098a418c13f668d92f12913e2774e7149e6d70c09"

RPROVIDES:${PN} += "nedit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
update-desktop-files"

inherit rpm
