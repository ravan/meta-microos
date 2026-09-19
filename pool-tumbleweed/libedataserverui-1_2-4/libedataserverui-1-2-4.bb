SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libedataserverui-1_2-4-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "68a7c18e38ca80733bfdf29256ea060ffc8865e64c75904e4943868ad10cad990ddf5181da169e93beb7b06ce85f254fc952ca64c3fcb36743a4d51517f55f18"

RPROVIDES:${PN} += "libedataserverui-1-2-4 \
libedataserverui-1.2.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcamel-1.2.so.67 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libical-glib.so.3 \
libnspr4.so \
libnss3.so \
libpango-1.0.so.0 \
libsmime3.so \
libsoup-3.0.so.0 \
libwebkit2gtk-4.1.so.0"

inherit rpm
