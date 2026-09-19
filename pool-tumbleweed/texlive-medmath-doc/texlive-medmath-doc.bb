SUMMARY = "Documentation for texlive-medmath"
DESCRIPTION = "This package includes the documentation for texlive-medmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025asvn74208"

RPM_NAME = "texlive-medmath-doc-2026.226.2025asvn74208-59.2.noarch.rpm"
RPM_HASH = "9a8b212e1fbe8225f740f09f12a2360ca36c80b7bfa0181a7adc00d1e0d675493b94e32fe1b7154c824212751b1233e5dab871b09ae92cc2f2e107a95ba570b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-medmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
