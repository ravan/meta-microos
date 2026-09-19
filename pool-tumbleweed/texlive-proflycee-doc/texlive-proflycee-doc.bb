SUMMARY = "Documentation for texlive-proflycee"
DESCRIPTION = "This package includes the documentation for texlive-proflycee"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.00dsvn77895"

RPM_NAME = "texlive-proflycee-doc-2026.226.4.00dsvn77895-59.2.noarch.rpm"
RPM_HASH = "1690e64ac8873e6acd4d3bb82116615ad26b08009b99adbd44c4022d5a25fb98237497e5aee1902923ed4146232d1a983f165ae235a808b737417c64acb5a256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-proflycee-doc-fr \
texlive-proflycee-doc"

RDEPENDS:${PN} += ""

inherit rpm
