SUMMARY = "Dropbox client integrated into Caja"
DESCRIPTION = "Dropbox is a proprietary service that lets one bring photos, \
documents, and videos anywhere and share them easily. \
 \
This package integrates Dropbox seamlessly into Caja."
LICENSE = "GPL-3.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-dropbox-1.28.0-2.7.aarch64.rpm"
RPM_HASH = "0adf12ef7ffe87b7397b51ea3ba43da2b6d1f6312702bef6f2276d01e59224e3b62792835e3e53ce169f3bb082699fc56eb1774fee1adaaf5cb990383a8ca3cc"

RPROVIDES:${PN} += "caja-dropbox \
caja-extension-dropbox \
libcaja-dropbox.so"

RDEPENDS:${PN} += "caja \
dropbox \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
