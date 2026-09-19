SUMMARY = "Documentation for texlive-stellenbosch"
DESCRIPTION = "This package includes the documentation for texlive-stellenbosch"
LICENSE = "LPPL-1.0"

PV = "2026.226.11asvn68039"

RPM_NAME = "texlive-stellenbosch-doc-2026.226.11asvn68039-64.2.noarch.rpm"
RPM_HASH = "d1f153a88521335a58d7ffe40a60a7268fc2fbb00dcc0a5496c81f44ca540572378b9c933f0389181f0a959ffd66736053e56b925fc1fc72822fc93e6c4305d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-stellenbosch-doc-en \
texlive-stellenbosch-doc"

RDEPENDS:${PN} += ""

inherit rpm
