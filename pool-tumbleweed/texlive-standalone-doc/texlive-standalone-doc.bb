SUMMARY = "Documentation for texlive-standalone"
DESCRIPTION = "This package includes the documentation for texlive-standalone"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5asvn77682"

RPM_NAME = "texlive-standalone-doc-2026.226.1.5asvn77682-64.2.noarch.rpm"
RPM_HASH = "b26eb729e89ca90f6f506e6902b000636752b6f217c107d1b4d7dacdec5e64c8c86a546e17f1d8aea25378a355cc0789b770fa1e53b26368d134d781511feabf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-standalone-doc"

RDEPENDS:${PN} += ""

inherit rpm
