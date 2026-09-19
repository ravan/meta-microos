SUMMARY = "Library for reading/writing quicktime movie files"
DESCRIPTION = "library for reading/writing quicktime movie files, based on and forked \
from quicktime4linux"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-devel-1.2.4+git20180804.fff99cd-9.7.aarch64.rpm"
RPM_HASH = "4f475dd456153bbd3a3f8b6119f6e05510e89ff7d3f9f4acb6b924bc6582f57ffdd1956d5b4df37fc80a4480ad0d4fb4c40923f8a2627eabb99bf4f7698eddbc"

RPROVIDES:${PN} += "libquicktime-devel \
pkgconfig-libquicktime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libquicktime \
libquicktime0"

inherit rpm
