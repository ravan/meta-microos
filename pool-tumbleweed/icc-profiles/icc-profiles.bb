SUMMARY = "OpenICC Data with complete ICC profiles"
DESCRIPTION = "The meta package installs a complete set of ICC profiles from the OpenICC \
Data collection. One Cmyk profile is contained."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-1.2-16.29.noarch.rpm"
RPM_HASH = "10360445f4a229418e320ed0b5f3598a4e9372e3414b244cc3e833c06eb201cf7be4fdf5ea46c6c8415552273c689255a47bb2e133758d42c11f8781c36edbc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles \
openicc-data"

RDEPENDS:${PN} += "icc-profiles-basiccolor-printing2009-coat2 \
icc-profiles-mini"

inherit rpm
