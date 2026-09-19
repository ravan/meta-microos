SUMMARY = "Documentation for texlive-mindflow"
DESCRIPTION = "This package includes the documentation for texlive-mindflow"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65236"

RPM_NAME = "texlive-mindflow-doc-2026.226.svn65236-61.2.noarch.rpm"
RPM_HASH = "25ef19fe6468e8d6273eee59261a2f79e51b7fc8f404b49ad528a52e807aa1034049144659dd7a5d03bd9ed4cf8fd7028e0b5538b082b81c5297604dcff2671b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mindflow-doc"

RDEPENDS:${PN} += ""

inherit rpm
