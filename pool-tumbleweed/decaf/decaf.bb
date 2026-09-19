SUMMARY = "Ed448-Goldilocks-based elliptic curve cryptography library"
DESCRIPTION = "Ed448-Goldilocks is an Edwards-form elliptic curve proposed by \
Michael Hamburg in 2015 and is suitable for cryptographic \
operation with small keysizes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "decaf-1.0.2-1.11.aarch64.rpm"
RPM_HASH = "f33b048c55e1b4b71699ae9958a71ead1a86a8a5a661c3409db92f1f673e4f5c65a932b772ce8fd342807b815ba483fa22d3fa6f0a01943151209e7383d77393"

RPROVIDES:${PN} += "decaf"

RDEPENDS:${PN} += ""

inherit rpm
