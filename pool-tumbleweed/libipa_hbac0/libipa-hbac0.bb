SUMMARY = "FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "libipa_hbac0-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "6682161264b15ecc03716d0f0359b1b12fbf277b40e5b3aada28bc693cdf70ae6f4dbc1401474fe2b1538143381aae4b79c5f73930f73d70a7fa7886aba5283f"

RPROVIDES:${PN} += "libipa-hbac.so.0 \
libipa-hbac0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libunistring.so.5"

inherit rpm
