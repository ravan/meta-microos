SUMMARY = "A text to postscript converter through pango"
DESCRIPTION = "paps is a command line program for converting Unicode text encoded in UTF-8 to postscript and pdf by using pango."
LICENSE = "LGPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "paps-0.8.0-4.6.aarch64.rpm"
RPM_HASH = "84fae5a43b09da71f6aeb9934544934b1b41bf022591d95643fa495d125409d960af8f42c81811d973b44a4cc91035acb3832e5f6bf9f5c99dfc9bb9665883c8"

RPROVIDES:${PN} += "paps"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libstdc++.so.6"

inherit rpm
