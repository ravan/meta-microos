SUMMARY = "Pango renderer for kmscon"
DESCRIPTION = "This package contains an optional renderer backend for kmscon using the pango \
library for advanced text layout and rendering. \
 \
By default, kmscon uses the freetype renderer, so only special configurations \
need to install this package and its dependencies."
LICENSE = "MIT"

PV = "10.0.3"

RPM_NAME = "kmscon-pango-10.0.3-1.1.aarch64.rpm"
RPM_HASH = "15e2f1dc82cf8adb450208d5cd70a0228ed41833763131ba305fe5d1d4672482471405b07dc7351070598fc66508dba6a458dd4579f26aa1b1caa0ca5179a9af"

RPROVIDES:${PN} += "kmscon-pango"

RDEPENDS:${PN} += "kmscon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libtsm.so.4"

inherit rpm
