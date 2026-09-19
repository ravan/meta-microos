SUMMARY = "Documentation for texlive-pst-venn"
DESCRIPTION = "This package includes the documentation for texlive-pst-venn"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-doc-2026.226.0.0.01svn49316-60.4.noarch.rpm"
RPM_HASH = "312c92d59871ae44c3623927623609ba23eb54bcc3fbb56507b16d4aadb4750d4a45414c5f8038ffe64662ac486f26c68dc1fc99f1225f556f678520045028e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-venn-doc"

RDEPENDS:${PN} += ""

inherit rpm
