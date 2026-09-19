SUMMARY = "Development files for libindi"
DESCRIPTION = "This package contains development files for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.2.4.2"

RPM_NAME = "indi-devel-2.2.4.2-1.1.aarch64.rpm"
RPM_HASH = "ad44804da12041f4ed265ff9727b19c1d71bb682bd2390a2f2e58a78822e4584c1b93cd83c01868bfffa89a1dbd48bd4c3f12a4ac5c6d434f9cdd68bf7c92e38"

RPROVIDES:${PN} += "indi-devel \
libindi-devel \
pkgconfig-libindi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libindiAlignmentDriver2 \
libindiclient2 \
libindiclientqt2 \
libindidriver2 \
libindilx200-2"

inherit rpm
