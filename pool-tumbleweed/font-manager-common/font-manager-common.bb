SUMMARY = "Common files used by font-manager"
DESCRIPTION = "This package contains common files such as libraries. \
 These files are required by font-manager and font-viewer."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4"

RPM_NAME = "font-manager-common-0.9.4-2.2.aarch64.rpm"
RPM_HASH = "9213228735f7893c59585d3cecb460460519b68547c5050badad239e697a055bd673e1b71cc4a38ca0469a0d96cfa98ea377a8350bd10e85ad6d326ea2c34d6a"

RPROVIDES:${PN} += "font-manager-common \
libfontmanager.so.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libharfbuzz.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libsqlite3.so.0 \
libxml2.so.16"

inherit rpm
