SUMMARY = "Atril extension for Caja file manager"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript. \
 \
This package contains the Atril extension for the Caja file manager. \
It adds an additional tab called 'Document' to the file properties \
dialog."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "caja-extension-atril-1.28.4-1.2.aarch64.rpm"
RPM_HASH = "879b0b067affa609987f83d6777b79197fdb5bb6cf831641e2bd2ede26bd1f536b1a12a14a99818c3019a974ea894810a2e8c7baddcc6b47a5bdff48697a6bcf"

RPROVIDES:${PN} += "atril-caja \
caja-extension-atril \
libatril-properties-page.so \
mate-document-viewer-caja"

RDEPENDS:${PN} += "atril \
caja \
ld-linux-aarch64.so.1 \
libatrildocument.so.3 \
libc.so.6 \
libcaja-extension.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
