SUMMARY = "MATE Desktop document viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "atril-1.28.4-1.2.aarch64.rpm"
RPM_HASH = "b2c61da7ec8431c6f9f1d8779eb3a7e87d24b45282ddbcf1d518010658e64af92d059d9703f4508b6c8ed6d236af957b4d57416e9bda2c850079085f040a749a"

RPROVIDES:${PN} += "atril \
mate-document-viewer"

RDEPENDS:${PN} += "atril-backends \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libatk-1.0.so.0 \
libatrildocument.so.3 \
libatrilview.so.3 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libxml2.so.16 \
mate-desktop-gsettings-schemas"

inherit rpm
