SUMMARY = "Documentation for texlive-pas-crosswords"
DESCRIPTION = "This package includes the documentation for texlive-pas-crosswords"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn32313"

RPM_NAME = "texlive-pas-crosswords-doc-2026.226.1.03svn32313-58.2.noarch.rpm"
RPM_HASH = "38396e961f9423f76534968ea0937bf5741327b652e940e4e6791c8d9db77bd2509b8bff080d55bde7b71927b18f3648a7a668ad045cf160b5f98c345fbed8da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pas-crosswords-doc-fr \
texlive-pas-crosswords-doc"

RDEPENDS:${PN} += ""

inherit rpm
