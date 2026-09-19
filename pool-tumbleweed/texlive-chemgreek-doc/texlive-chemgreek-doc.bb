SUMMARY = "Documentation for texlive-chemgreek"
DESCRIPTION = "This package includes the documentation for texlive-chemgreek"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-chemgreek-doc-2026.226.1.1asvn77682-60.2.noarch.rpm"
RPM_HASH = "0fda59c300a983ef01787a26cb0efc4bb2b70eb2b08334b2f63092d2a846869134efc502395c13509a886de9be1d44e8b9a0a3b9815f53417e147284f96a2e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
