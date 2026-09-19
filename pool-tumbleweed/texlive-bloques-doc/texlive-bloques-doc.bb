SUMMARY = "Documentation for texlive-bloques"
DESCRIPTION = "This package includes the documentation for texlive-bloques"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn22490"

RPM_NAME = "texlive-bloques-doc-2026.226.1.0svn22490-59.2.noarch.rpm"
RPM_HASH = "01e0b6fb79ec9bd345023ce8222e78a826b49898a533cc1ee4086716b9516fc8990c69c13bdefa1c522b90f9fd4b1673b4bc3491e7adc462670a24e2a8b2ba89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bloques-doc"

RDEPENDS:${PN} += ""

inherit rpm
