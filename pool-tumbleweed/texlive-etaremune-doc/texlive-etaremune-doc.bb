SUMMARY = "Documentation for texlive-etaremune"
DESCRIPTION = "This package includes the documentation for texlive-etaremune"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-etaremune-doc-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "bb1c51b1b15d563ebdfe9cb503e2d6d81a1fd8e51030cd800e7922d7a16ff27549b61ad3e7711ed5631a293befd63b92d77f8ff1aaba49071617add55c36a21d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etaremune-doc"

RDEPENDS:${PN} += ""

inherit rpm
