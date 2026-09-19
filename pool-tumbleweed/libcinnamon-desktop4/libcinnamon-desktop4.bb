SUMMARY = "Libcinnamon-desktop API"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
The libcinnamon-desktop library provides API shared by several \
applications on the desktop, but that cannot live in the platform \
for various reasons. There is no API or ABI guarantee, although we \
are doing our best to provide stability. Documentation for the API \
is available with gtk-doc."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "libcinnamon-desktop4-6.4.1-1.8.aarch64.rpm"
RPM_HASH = "3ed33a052fb2e24f32e0f715ff365de6cd067abf1e2696dbf8257f074b788fc56416bbce941b314f37ec115ae5d784c4b0b7d0d2520fcfac6b3533e42d00d5d8"

RPROVIDES:${PN} += "cinnamon-desktop \
libcinnamon-desktop \
libcinnamon-desktop.so.4 \
libcinnamon-desktop4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libcinnamon-desktop-data \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libsystemd.so.0 \
libudev.so.1"

inherit rpm
