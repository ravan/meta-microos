SUMMARY = "Documentation for texlive-uml"
DESCRIPTION = "This package includes the documentation for texlive-uml"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn17476"

RPM_NAME = "texlive-uml-doc-2026.226.0.0.11svn17476-60.2.noarch.rpm"
RPM_HASH = "d2c687aa577ae4b5f89cc48c6b1330fcad2e4305b70c16d6e2830e2968bf1bbb16878b26b24bd947da09031098c8491a8410b97686489d60124166d6632e9ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uml-doc"

RDEPENDS:${PN} += ""

inherit rpm
