SUMMARY = "Documentation for texlive-ffslides"
DESCRIPTION = "This package includes the documentation for texlive-ffslides"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn38895"

RPM_NAME = "texlive-ffslides-doc-2026.226.svn38895-59.2.noarch.rpm"
RPM_HASH = "3df0406f245e9ef2dd011aa4a5306673cefd4152dec0479243d71cb2eee69d87ff946988dd209067884624a76959cba14d71a9cf6c9340a741ce41aa1d600f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ffslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
