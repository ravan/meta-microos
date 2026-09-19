SUMMARY = "Utilities for analysing and setting file capabilities"
DESCRIPTION = "The libcap-ng-utils package contains applications to analyse the \
Linux process capabilities of programs running on a system. It also \
lets you set the filesystem-based capabilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "libcap-ng-utils-0.8.5-1.10.aarch64.rpm"
RPM_HASH = "f78d9051018b43d6ffbfa2d491debc62a449292161ed2ad3c5985fa9e7685425cabec06b32e79083e007483a9f0eebc81672fdd679656a9f7d5549f40c661c2d"

RPROVIDES:${PN} += "libcap-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0"

inherit rpm
