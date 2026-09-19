SUMMARY = "ATA S.M.A.R.T. Disk Health Monitoring Library - Utilities"
DESCRIPTION = "A small and lightweight parser library for ATA S.M.A.R.T. hard disk \
health monitoring."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19"

RPM_NAME = "libatasmart-utils-0.19-11.9.aarch64.rpm"
RPM_HASH = "dbaca50417ff547c1b5c872b0d8a4b3f9985433f0ebf5bbfba0e9061d824651967663988cb8a81095329266b0efb60416b4e3947fcafa8c91b891ce201dd0d1c"

RPROVIDES:${PN} += "libatasmart-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libatasmart4 \
libc.so.6"

inherit rpm
