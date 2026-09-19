SUMMARY = "Documentation for Scheme48"
DESCRIPTION = "Documentation for Scheme48 VM and interpreter"
LICENSE = "BSD-3-Clause"

PV = "1.9.3"

RPM_NAME = "scheme48-doc-1.9.3-1.14.aarch64.rpm"
RPM_HASH = "5ea465014cf4e418dbb2061e59a7489c5ab29105a97a1b3e812cab62f6d87dd955fc696cb7588612d14fbd849231852cb4e163310c0f25a4130572ef5a8fd69c"

RPROVIDES:${PN} += "scheme48-doc"

RDEPENDS:${PN} += ""

inherit rpm
