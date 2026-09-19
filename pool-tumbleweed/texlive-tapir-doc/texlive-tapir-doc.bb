SUMMARY = "Documentation for texlive-tapir"
DESCRIPTION = "This package includes the documentation for texlive-tapir"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.2svn20484"

RPM_NAME = "texlive-tapir-doc-2026.227.0.0.2svn20484-62.2.noarch.rpm"
RPM_HASH = "43c979214270f0b973453115b9ab2d20ec8f49abca78d18e8c92f710b0d2eec8d752b61794ed5ca7f17ddb3ec9fa9669b08db59ac569825f30bcb159880f1acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tapir-doc"

RDEPENDS:${PN} += ""

inherit rpm
