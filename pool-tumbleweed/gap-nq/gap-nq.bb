SUMMARY = "GAP: Nilpotent Quotients of Finitely Presented Groups"
DESCRIPTION = "This package provides access to the ANU nilpotent quotient program \
for computing nilpotent factor groups of finitely presented groups."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "gap-nq-2.6.0-1.1.aarch64.rpm"
RPM_HASH = "8a63e0b1486b6b040c5aa4bc6e9673a7273ec104537e0b0c5528ad4f0300f987f726a9a80e5194e307c09a287ce8b919dc44b8a0f387219624960eb2830f75b4"

RPROVIDES:${PN} += "gap-nq"

RDEPENDS:${PN} += "gap-core \
gap-polycyclic \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
