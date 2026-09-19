SUMMARY = "Documentation for texlive-russ"
DESCRIPTION = "This package includes the documentation for texlive-russ"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25209"

RPM_NAME = "texlive-russ-doc-2026.226.svn25209-60.2.noarch.rpm"
RPM_HASH = "89417680012f206baf2676772399ac9f300dfc7dc36d4ce13b7d930a4c7d958dae26ac130f8ae6f3cfeeef1157016a050d9fbf44ea3c269cd23a6f6f78320146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-russ-doc-en;ru \
texlive-russ-doc"

RDEPENDS:${PN} += ""

inherit rpm
