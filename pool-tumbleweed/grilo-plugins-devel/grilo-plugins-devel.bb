SUMMARY = "Development files for Grilo plugins"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.18"

RPM_NAME = "grilo-plugins-devel-0.3.18-2.3.aarch64.rpm"
RPM_HASH = "27c5102fd7e4a517c0f7208ee11f780d912cf01db6959529851e6eebff2e02c46dc7abd56f3ebab739ede8f9fb971f5ce5109e1eb97fbfaa500787d6f21b95d1"

RPROVIDES:${PN} += "grilo-plugins-devel \
pkgconfig-grilo-plugins-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
grilo-plugin-dleyna \
grilo-plugin-tracker \
grilo-plugins"

inherit rpm
