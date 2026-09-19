SUMMARY = "Documentation for texlive-multicolrule"
DESCRIPTION = "This package includes the documentation for texlive-multicolrule"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn78101"

RPM_NAME = "texlive-multicolrule-doc-2026.226.1.3asvn78101-61.2.noarch.rpm"
RPM_HASH = "150783cf3bb1addccf59d3c2dee083582c8950aa33ce85a40f963f98773813584f9ed6b030222566c617ce24d0e2ff119ec7f2f7f6f7d3aa0e214fb41227207e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multicolrule-doc"

RDEPENDS:${PN} += ""

inherit rpm
