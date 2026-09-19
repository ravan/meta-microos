SUMMARY = "Development files for libiscsi"
DESCRIPTION = "Development files for libiscsi"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.3"

RPM_NAME = "libiscsi-devel-1.20.3-1.3.aarch64.rpm"
RPM_HASH = "a23edf088082f0f03452782a7c2f1ada05434dff273ac1f16be6f1fa8b57540ecac2a982d3f0b1de7dcffdf0581f50ece9c596f1f056d7e75f34fbc50e91c666"

RPROVIDES:${PN} += "libiscsi-devel \
pkgconfig-libiscsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiscsi11"

inherit rpm
