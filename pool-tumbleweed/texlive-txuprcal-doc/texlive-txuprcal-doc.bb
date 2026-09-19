SUMMARY = "Documentation for texlive-txuprcal"
DESCRIPTION = "This package includes the documentation for texlive-txuprcal"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.00svn77682"

RPM_NAME = "texlive-txuprcal-doc-2026.226.1.00svn77682-59.2.noarch.rpm"
RPM_HASH = "502832c767f68efe9aec47ba968c255c8707d0acd7a6c6ab9884d7470014747f897fbbba3d065ea327cfa0b4d3b12a84defceb2b0848401f6633777986dc4747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txuprcal-doc"

RDEPENDS:${PN} += ""

inherit rpm
