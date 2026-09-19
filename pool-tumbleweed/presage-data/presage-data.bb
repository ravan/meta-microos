SUMMARY = "Intelligent predictive text entry platform (data files)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the sample statistical data files and abbreviation files needed by presage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "presage-data-0.9.1-18.6.aarch64.rpm"
RPM_HASH = "5e1317f941e9739d1ad4c6558c1110cdc275c201902aff25ae49f0fce11686a1448c0d13c3a6a2bb3266facf2b39adedf4f25aefe4437a49b65aeabab0e6a2ed"

RPROVIDES:${PN} += "config-presage-data \
libpresage-data \
presage-data"

RDEPENDS:${PN} += ""

inherit rpm
