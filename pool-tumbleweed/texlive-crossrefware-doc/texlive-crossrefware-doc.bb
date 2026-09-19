SUMMARY = "Documentation for texlive-crossrefware"
DESCRIPTION = "This package includes the documentation for texlive-crossrefware"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76407"

RPM_NAME = "texlive-crossrefware-doc-2026.226.svn76407-61.2.noarch.rpm"
RPM_HASH = "150981937961b8a5fb14b0317aaf74fc1bf6725b9b0a865614c2de6890d777e474dad0ff3326b1a2d28420b9d0a3ded592065468b7914451769ce94b1b6bddff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bbl2bib.1 \
man-bibdoiadd.1 \
man-bibmradd.1 \
man-biburl2doi.1 \
man-bibzbladd.1 \
man-ltx2crossrefxml.1 \
texlive-crossrefware-doc"

RDEPENDS:${PN} += ""

inherit rpm
