SUMMARY = "Upper Sorbian (hornjoserbsce) Dictionary for Aspell"
DESCRIPTION = "An Upper Sorbian (hornjoserbsce) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.0"

RPM_NAME = "aspell-hsb-0.02.0-4.7.aarch64.rpm"
RPM_HASH = "dd217cd495047d136d02da8dbd29c5f368780689a76ac445134686a403cf0f2125f148e0c95b340869ee606072f10567d0416600b51cfe467ecded1e38505dd2"

RPROVIDES:${PN} += "aspell-hsb \
locale-aspell-hsb"

RDEPENDS:${PN} += ""

inherit rpm
