SUMMARY = "OpenICC Data with minimal ICC profiles"
DESCRIPTION = "The meta package installs a minimal set of ICC profiles from the OpenICC \
Data collection. No Cmyk and Gray profiles are contained."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-mini-1.2-16.29.noarch.rpm"
RPM_HASH = "dbb5d15409c2c1afb8056265c8f1133b35f5f1d4da2606ee159a89db84d075903c9026edb2868c426b3aa4b8d47b6ca8e4a3009365b3381c9ff55cadf49fd4dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-mini"

RDEPENDS:${PN} += "icc-profiles-basiccolor-lstarrgb \
icc-profiles-lcms-lab \
icc-profiles-openicc-rgb"

inherit rpm
