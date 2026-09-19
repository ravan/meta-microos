SUMMARY = "Nemo extension shared libraries"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment. \
 \
This package provides Nemo's shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.4"

RPM_NAME = "libnemo-extension1-6.6.4-1.1.aarch64.rpm"
RPM_HASH = "b9b7689b1c6e0d4fd45fd2fa4c7616e477ba36bcdfb7384a66ae630a30efe1d461a45a223648482ccfa4f046fa575fcea5a3802dac7d97b6d6010cec8d73ea54"

RPROVIDES:${PN} += "libnemo-extension.so.1 \
libnemo-extension1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
