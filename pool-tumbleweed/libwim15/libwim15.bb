SUMMARY = "Library to extract, create, modify, and mount WIM files"
DESCRIPTION = "wimlib is a C library for creating, extracting, modifying, and mounting files in \
the Windows Imaging Format (WIM files)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.14.4"

RPM_NAME = "libwim15-1.14.4-1.13.aarch64.rpm"
RPM_HASH = "27df98252d64ee5132ca47360b8c072e56a8d97b73dd4d331782a14018ea3989ff8fd43a67f1b23f4ea1c32a410ad4b9dcfa4880ddac7199010d770de9617e16"

RPROVIDES:${PN} += "libwim.so.15 \
libwim15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libntfs-3g.so.90"

inherit rpm
