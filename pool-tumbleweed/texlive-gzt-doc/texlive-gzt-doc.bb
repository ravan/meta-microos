SUMMARY = "Documentation for texlive-gzt"
DESCRIPTION = "This package includes the documentation for texlive-gzt"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.5svn74605"

RPM_NAME = "texlive-gzt-doc-2026.226.1.1.5svn74605-60.4.noarch.rpm"
RPM_HASH = "3433b95e203c42c658ab8ed1ffa9f63f2232f046278f909868ff51fa0a73f81cce56aae52ae5bb72cbcfaed81a2ea0bdc10113f12e07260702ebeed69bb6666c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gzt-doc-fr \
texlive-gzt-doc"

RDEPENDS:${PN} += ""

inherit rpm
