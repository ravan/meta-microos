SUMMARY = "Development files for openEMS"
DESCRIPTION = "This package contains libraries for developing applications \
that use openEMS."
LICENSE = "GPL-3.0-only"

PV = "0.0.36"

RPM_NAME = "openEMS-devel-0.0.36-4.8.aarch64.rpm"
RPM_HASH = "73033cd521b8467f3fab58c1d5be821246fec25d90fd16cabcc061e46c1fff787a16dd1ada54607587a66f0f8ca56e0154ab6cca1a66b69ce0a24121a9f849d5"

RPROVIDES:${PN} += "openEMS-devel"

RDEPENDS:${PN} += "libnf2ff0 \
libopenEMS0"

inherit rpm
