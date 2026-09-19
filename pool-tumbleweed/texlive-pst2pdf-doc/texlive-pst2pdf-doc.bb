SUMMARY = "Documentation for texlive-pst2pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.20svn56172"

RPM_NAME = "texlive-pst2pdf-doc-2026.226.0.0.20svn56172-60.4.noarch.rpm"
RPM_HASH = "700d3b3e4054f2efbf58493d896c82103853f739364af7a1d4a225f5333f217e4a4afb1f4ae2b7c1a317f8495effa86d84f7fff87e24647547b2a4acc3b475fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst2pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
