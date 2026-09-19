SUMMARY = "Support programs for Airspy"
DESCRIPTION = "A tiny and efficient software defined radio."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "airspy-1.0.10-3.5.aarch64.rpm"
RPM_HASH = "20df38fe90e04f98feca768cd550c5f3ffafe3ab5567fb08d15d1cda1fe99f31bc8f2e3b5afeac65208dd1e88660d6f15ef924fc8623306d2eff90671baa8e19"

RPROVIDES:${PN} += "airspy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libairspy.so.0 \
libc.so.6"

inherit rpm
