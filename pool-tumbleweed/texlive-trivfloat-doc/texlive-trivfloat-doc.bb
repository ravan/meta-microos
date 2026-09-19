SUMMARY = "Documentation for texlive-trivfloat"
DESCRIPTION = "This package includes the documentation for texlive-trivfloat"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3bsvn77682"

RPM_NAME = "texlive-trivfloat-doc-2026.226.1.3bsvn77682-59.2.noarch.rpm"
RPM_HASH = "1d3ab6146b2a352d4bddbf53b06c118cd6114b98b8b500566d1907694eac90bb38fc6b9ebf8abf9f19de5725dece4cdb0359c75de8ebb60f41bbc55651ce8fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trivfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
