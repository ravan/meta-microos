SUMMARY = "Documentation for texlive-tabularray"
DESCRIPTION = "This package includes the documentation for texlive-tabularray"
LICENSE = "LPPL-1.0"

PV = "2026.227.2025csvn77682"

RPM_NAME = "texlive-tabularray-doc-2026.227.2025csvn77682-62.2.noarch.rpm"
RPM_HASH = "239a8a27691612bb5ac807007289b00846c8d7087c75d596fa9b517d109af39b87112c782b80324628b5f1b96df068f5dd3b09add668cec3bb5d716aeecbab88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabularray-doc"

RDEPENDS:${PN} += ""

inherit rpm
