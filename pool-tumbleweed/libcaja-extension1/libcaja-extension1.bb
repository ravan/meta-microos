SUMMARY = "Caja shared libraries"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.0"

RPM_NAME = "libcaja-extension1-1.28.0-1.14.aarch64.rpm"
RPM_HASH = "2e95f14230e121c956553ca04d74af8470dce9d8a699f6f56aacecef417872ed7dc11ffdb3aacf98dfdc3a5fe22c351699e705ae4f3c8133410437411b75ac77"

RPROVIDES:${PN} += "libcaja-extension.so.1 \
libcaja-extension1"

RDEPENDS:${PN} += "/sbin/ldconfig \
caja-gschemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
