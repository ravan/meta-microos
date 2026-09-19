SUMMARY = "A window matching utility"
DESCRIPTION = "Devilspie 2 is based on the excellent program Devil's Pie by Ross Burton, and \
takes a folder as in-data, and checks that folder for LUA scripts. These \
scripts are run each time a window is opened, and the rules in them are applied \
on the window. \
 \
Unfortunately the rules of the original Devil's Pie are not supported."
LICENSE = "GPL-3.0-or-later"

PV = "0.45"

RPM_NAME = "devilspie2-0.45-2.3.aarch64.rpm"
RPM_HASH = "e70e1f2c2c41ed22286bb2edc35036dc3dc93c69437a11f95240642499e94366152783e4584dcccb98574525da262b9b53d1dfc3f837ac6d7632144f3d7184f5"

RPROVIDES:${PN} += "devilspie2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblua5.3.so.5 \
libwnck-3.so.0"

inherit rpm
