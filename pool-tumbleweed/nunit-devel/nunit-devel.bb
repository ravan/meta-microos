SUMMARY = "Development files for NUnit"
DESCRIPTION = "This package contains development files for NUnit integration."
LICENSE = "Zlib"

PV = "2.6.4"

RPM_NAME = "nunit-devel-2.6.4-5.14.aarch64.rpm"
RPM_HASH = "4b02fc87daaf22a6cbabc8dd3bcd9fdec5d5e3332d4a5354ff17f2e4df0bc9773f747727b9712f7d3e80d61df062af0c8dff16c1e77177163583c219443862ef"

RPROVIDES:${PN} += "mono-nunit-devel \
nunit-devel \
pkgconfig-mono-nunit \
pkgconfig-nunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
nunit"

inherit rpm
