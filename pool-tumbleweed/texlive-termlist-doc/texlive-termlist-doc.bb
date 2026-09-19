SUMMARY = "Documentation for texlive-termlist"
DESCRIPTION = "This package includes the documentation for texlive-termlist"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn18923"

RPM_NAME = "texlive-termlist-doc-2026.227.1.1svn18923-62.2.noarch.rpm"
RPM_HASH = "fbb24cc71902b05f9c44e61dbbaf063c840b76a45bbc18e21ff298f01c192f52ab71758b8eea632052845199e41e68815255cd27a3cad7c736caa6b45842874c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
