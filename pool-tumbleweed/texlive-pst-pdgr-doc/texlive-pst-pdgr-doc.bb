SUMMARY = "Documentation for texlive-pst-pdgr"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdgr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn45875"

RPM_NAME = "texlive-pst-pdgr-doc-2026.226.0.0.4svn45875-60.4.noarch.rpm"
RPM_HASH = "be17e564ca2a47df667042ec86e158935ff61559fa4602ec2a431adbac30b5ccea3cd699affb50dc5fcfb5f00eade714ac286d9296985e0ee8094fcd6a07f066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pdgr-doc"

RDEPENDS:${PN} += ""

inherit rpm
