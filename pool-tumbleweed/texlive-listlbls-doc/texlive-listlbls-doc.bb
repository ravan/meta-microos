SUMMARY = "Documentation for texlive-listlbls"
DESCRIPTION = "This package includes the documentation for texlive-listlbls"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn77682"

RPM_NAME = "texlive-listlbls-doc-2026.226.1.04svn77682-61.2.noarch.rpm"
RPM_HASH = "87d639c326fb0aa61cad046b58075263ffc5e551c0f24f522a0791c43dad49e5557e8950a959ad15ca6d88fb0ea939b4a40163ffe2832278104c4bd6b7122b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listlbls-doc"

RDEPENDS:${PN} += ""

inherit rpm
