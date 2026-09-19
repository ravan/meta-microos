SUMMARY = "Documentation for texlive-auncial-new"
DESCRIPTION = "This package includes the documentation for texlive-auncial-new"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn62977"

RPM_NAME = "texlive-auncial-new-doc-2026.226.2.0svn62977-60.2.noarch.rpm"
RPM_HASH = "24eff7a1e41100612f4ff5612cfd170bd9aaba37c33ac793caac78352c2ba9f82d1e413eb05ed909e7e9724add2beeaae3813baaacd811d03cde1b1dca3c1de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-auncial-new-doc"

RDEPENDS:${PN} += ""

inherit rpm
