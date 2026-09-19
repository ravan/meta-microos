SUMMARY = "Package provides recommended R-MASS"
DESCRIPTION = "This packages provides R-MASS, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.65"

RPM_NAME = "R-MASS-7.3.65-58.3.aarch64.rpm"
RPM_HASH = "61f6e9dd90c00055c8ac0cf506bbf783961d4f3ec4cd7dade1f92aa83b2afa0b53b6185e5fbe9a1feb2035bc9bae0e7f882881f523fe1916cce9c801947bca7f"

RPROVIDES:${PN} += "R-MASS"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
