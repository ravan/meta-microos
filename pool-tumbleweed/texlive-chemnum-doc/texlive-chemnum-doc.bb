SUMMARY = "Documentation for texlive-chemnum"
DESCRIPTION = "This package includes the documentation for texlive-chemnum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn77682"

RPM_NAME = "texlive-chemnum-doc-2026.226.1.3asvn77682-60.2.noarch.rpm"
RPM_HASH = "38f82ae10024d841f2ad08fc15f5c0081f509b88a46dc42992f4460199b9a6421216668e58442167e8611d23a23f3ff6fd3c87921f6690b34e0cc116fe20be30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
