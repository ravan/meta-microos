SUMMARY = "An easy to use virtual keyboard toolkit"
DESCRIPTION = "eekboard is a virtual keyboard software package, including a set of \
tools to implement desktop virtual keyboards."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "eekboard-1.0.8-12.9.aarch64.rpm"
RPM_HASH = "4768313f2fb6cab1a37008402f792b77ffd39ed62d5a98dc7930c6cb300484149579d55451283dc9d64a8fae473f3c25d3901ee29325d78d9b26db2a588ef32d"

RPROVIDES:${PN} += "config-eekboard \
eekboard \
libeek-gtk.so.0 \
libeek-xkl.so.0 \
libeek.so.0 \
libeekboard.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libatspi.so.0 \
libc.so.6 \
libcairo.so.2 \
libcroco-0.6.so.3 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxklavier.so.16"

inherit rpm
