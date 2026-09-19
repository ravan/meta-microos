SUMMARY = "Documentation for texlive-semantic-markup"
DESCRIPTION = "This package includes the documentation for texlive-semantic-markup"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn53607"

RPM_NAME = "texlive-semantic-markup-doc-2026.226.svn53607-60.2.noarch.rpm"
RPM_HASH = "cab0a39a007f022f68c248c062b7648027d1efa9f27562c6436034f43c16c132e46ccc35ae81b28fb0558a36825d94f3a5f89e5676dffa383dcac7ec7e6ed5f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semantic-markup-doc"

RDEPENDS:${PN} += ""

inherit rpm
