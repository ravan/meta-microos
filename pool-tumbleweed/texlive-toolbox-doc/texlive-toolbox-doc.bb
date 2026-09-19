SUMMARY = "Documentation for texlive-toolbox"
DESCRIPTION = "This package includes the documentation for texlive-toolbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.1svn32260"

RPM_NAME = "texlive-toolbox-doc-2026.226.5.1svn32260-59.2.noarch.rpm"
RPM_HASH = "89f0fd7de050e366f78ab8e91cd33680f6ae5018d1872a04cbc6e90647569767190e3b5c5fe683ffaef03cb2199034027675864b15db150be3d784511aaebd5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-toolbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
