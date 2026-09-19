SUMMARY = "Development files for Airspy HF+"
DESCRIPTION = "Library headers for Airspy HF+ driver."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "airspyhf-devel-1.6.8-4.7.aarch64.rpm"
RPM_HASH = "685ed3c0f5260c92af06669a8c467853b6566b3a74151ad4e75762c4844f6380a32c465a4fb71eaddaf1c338a75296cd5e84494850fceee568e71dd1a2679bac"

RPROVIDES:${PN} += "airspyhf-devel \
pkgconfig-libairspyhf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libairspyhf0"

inherit rpm
