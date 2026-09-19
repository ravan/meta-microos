SUMMARY = "Shared library for fswatch"
DESCRIPTION = "Shared library for fswatch a file change monitor."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.0"

RPM_NAME = "libfswatch15-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "ae97b5488559050c00c00208bc0fbea92b6b97d50a2ac28c73900ebb3a53cfcf7aed01fa38e5aac3a4b40ddbefd3934bd6bf964c2e810955b032ef244a7b6d88"

RPROVIDES:${PN} += "libfswatch.so.15 \
libfswatch15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
