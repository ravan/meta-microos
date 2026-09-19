SUMMARY = "Documentation for capstone, a disassembly framework"
DESCRIPTION = "Capstone is a multi-architecture disassembly framework."
LICENSE = "BSD-3-Clause"

PV = "5.0.6"

RPM_NAME = "capstone-doc-5.0.6-2.3.noarch.rpm"
RPM_HASH = "e6345504deccde1ee86f4690c2908a27ec16fe1366f00d5de652aa00bffaff9445dfae72494d6184c2eff29f4d59a13c3fbb4e43d74c0d773cfd6ee07dc1575c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "capstone-doc"

RDEPENDS:${PN} += ""

inherit rpm
