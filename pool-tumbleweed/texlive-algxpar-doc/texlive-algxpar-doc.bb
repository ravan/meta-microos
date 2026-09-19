SUMMARY = "Documentation for texlive-algxpar"
DESCRIPTION = "This package includes the documentation for texlive-algxpar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.99.2asvn76924"

RPM_NAME = "texlive-algxpar-doc-2026.226.0.0.99.2asvn76924-61.2.noarch.rpm"
RPM_HASH = "17530b9c24b0d3a5d98dca1beecfe7335ffbb86c80ebe9b0a41361d443de15edd4b05206de61db4f588662eac0e1f17227a50db9f87ffb7d9e6b337be6b1a978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algxpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
