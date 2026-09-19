SUMMARY = "Documentation for texlive-phfsvnwatermark"
DESCRIPTION = "This package includes the documentation for texlive-phfsvnwatermark"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41870"

RPM_NAME = "texlive-phfsvnwatermark-doc-2026.226.1.0svn41870-58.2.noarch.rpm"
RPM_HASH = "720f2d5b2d36f26e59bc99bd113029e52508a07217e81c09b28dd744e0e7e2229d68165f6132d6051c7b806757f4e93868915547015ce1c245078540e2144277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfsvnwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
