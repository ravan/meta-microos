SUMMARY = "ATA S.M.A.R.T. Disk Health Monitoring Library - Development Files"
DESCRIPTION = "A small and lightweight parser library for ATA S.M.A.R.T. hard disk \
health monitoring."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19"

RPM_NAME = "libatasmart-devel-0.19-11.9.aarch64.rpm"
RPM_HASH = "b52b1dec8d7da02c4542eb866df1d2b327c566930281595336780e71b612c1e27b8799fca2abebfd13117a3fca4bffa5427733a45136ce3417eeafceeb5f2b52"

RPROVIDES:${PN} += "libatasmart-devel \
pkgconfig-libatasmart"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libatasmart4"

inherit rpm
