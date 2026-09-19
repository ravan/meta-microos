SUMMARY = "Documentation for texlive-newfloat"
DESCRIPTION = "This package includes the documentation for texlive-newfloat"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-newfloat-doc-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "20022a7472e4788c5142f69a0a8c2756c616a2ca892055403001b6bec42dfe7bcf5f187332117569dc824e392c884602a5da9618de1c65d6619c904eb27fe511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
