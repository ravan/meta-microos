SUMMARY = "Development files for libdecaf"
DESCRIPTION = "Development files for Ed448-Goldilocks, an Edwards-form elliptic \
curve proposed suitable for cryptographic operation with small \
keysizes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "decaf-devel-1.0.2-1.11.aarch64.rpm"
RPM_HASH = "ee4f196cf335c1143fd279564024027206dd695a9c15cd8827f493c665012618da0fbabb3143c40d66f316cb3db17ec7eb6b29f34482a09d9bb79d5a370a373e"

RPROVIDES:${PN} += "decaf-devel"

RDEPENDS:${PN} += "libdecaf0"

inherit rpm
