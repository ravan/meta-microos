SUMMARY = "Documentation for texlive-gtrlib-largetrees"
DESCRIPTION = "This package includes the documentation for texlive-gtrlib-largetrees"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-doc-2026.226.1.2bsvn49062-60.4.noarch.rpm"
RPM_HASH = "98c898b55d2700b6b051bbbdd6ca4009f4c20f427dac8216f5a0364d0ef60656713f19cdc174cb8e438716d26f9d3110ce0d1d6f21008746847b62cb8bf4639b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrlib-largetrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
