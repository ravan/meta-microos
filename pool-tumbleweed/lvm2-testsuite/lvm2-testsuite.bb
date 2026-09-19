SUMMARY = "LVM2 Testsuite"
DESCRIPTION = "An extensive functional testsuite for the LVM2 Logical Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.38"

RPM_NAME = "lvm2-testsuite-2.03.38-2.5.aarch64.rpm"
RPM_HASH = "dadc0a2628f6738b279a505f607dd80e5fb5f05d0c0ca8daaadf627833cb624e60a30a6357cae42b1784d0e392d3e553ea7e195a639af2d4eb567d606813425f"

RPROVIDES:${PN} += "lvm2-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libgcc-s.so.1 \
liblvm2cmd2-03 \
libselinux.so.1 \
libstdc++.so.6 \
libudev.so.1 \
lvm2"

inherit rpm
