SUMMARY = "Documentation for texlive-docshots"
DESCRIPTION = "This package includes the documentation for texlive-docshots"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.3svn69676"

RPM_NAME = "texlive-docshots-doc-2026.226.0.0.4.3svn69676-59.2.noarch.rpm"
RPM_HASH = "2df4bdb58b88f11897c192d53f1f4bed27bd1110c2f53135c11aefbf0cd1592135f283c52c4bb8e29f88d1abab65e482b333fbd6aed7726e010be897e81b1cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docshots-doc"

RDEPENDS:${PN} += ""

inherit rpm
