SUMMARY = "SPICE-protocol definitions"
DESCRIPTION = "Headers defining the SPICE-protocol"
LICENSE = "BSD-3-Clause"

PV = "0.14.5"

RPM_NAME = "spice-protocol-devel-0.14.5-1.4.noarch.rpm"
RPM_HASH = "c9d64d1667671951257cc14bca25b289c9762cfafcc0eb085acbc8c2bbeff7a7ff9431adc6e7d8fd92de19b8ad08de1ea52e697c143546224a3fade3719f0c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-spice-protocol \
spice-protocol-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
