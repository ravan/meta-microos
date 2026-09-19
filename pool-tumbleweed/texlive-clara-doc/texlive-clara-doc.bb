SUMMARY = "Documentation for texlive-clara"
DESCRIPTION = "This package includes the documentation for texlive-clara"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-clara-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "545f5fedff24e7c6ffe603d57f7bdc88d6d765c41e0dc4d97e3f0f4b129c45f3d697bd0ed841da82ed7858f0756afa0c6a5d35a3ed3d2d75c5369beeefe38437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clara-doc"

RDEPENDS:${PN} += ""

inherit rpm
