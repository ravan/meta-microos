SUMMARY = "Demo binaries for the Granite development library"
DESCRIPTION = "This package contains a small demo application to show a widget of granite6"
LICENSE = "LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite6-demo-6.2.0-2.8.aarch64.rpm"
RPM_HASH = "7eec22ef5c306bb756a4c17bd926fb6a442769302fc7137838705d7778020f3641743bf02e42bd0595ffe9f238c4d9b467b8b8d4971130f79d5c6238594d62e5"

RPROVIDES:${PN} += "granite6-demo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
