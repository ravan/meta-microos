SUMMARY = "Documentation for texlive-garrigues"
DESCRIPTION = "This package includes the documentation for texlive-garrigues"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-garrigues-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "e8d6bea0093048608ce511d7f30c6c6dc05c9b3010f0c9685c718044dc6e251f9e38244e6d3724ea48d94d3a6905dab729c080b2dea8d478aec4ba14d355f64e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garrigues-doc"

RDEPENDS:${PN} += ""

inherit rpm
