SUMMARY = "Chdir for DOS and Unix"
DESCRIPTION = "Wcd.   Directory changer for DOS and Unix.  Another Norton \
Change Directory (NCD) clone. \
 \
Wcd is a command-line program to change directory fast. It \
saves time typing at the keyboard.  One needs to type only \
a part of a directory  name and wcd  will jump to it.  Wcd \
has a fast selection  method  in  case of multiple matches \
and allows aliasing and  banning of directories.  Wcd also \
includes a full-screen interactive  directory tree browser \
with speed search."
LICENSE = "GPL-2.0-only"

PV = "6.0.6"

RPM_NAME = "wcd-6.0.6-1.3.aarch64.rpm"
RPM_HASH = "96644a139ae53d790408e054b6fea775dc467a83820dc1f209b14e06e1ce172b78807b24305b0d404d4803d31e93fb6d5dc78839c60bad6743ab3797d27fb709"

RPROVIDES:${PN} += "config-wcd \
wcd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libunistring.so.5"

inherit rpm
