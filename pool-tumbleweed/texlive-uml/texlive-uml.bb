SUMMARY = "UML diagrams in LaTeX"
DESCRIPTION = "A PSTricks related package for writing UML (Unified Modelling \
Language) diagrams in LaTeX. Currently, it implements a subset \
of class diagrams, and some extra constructs as well. The \
package cannot be used together with pst-uml."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn17476"

RPM_NAME = "texlive-uml-2026.226.0.0.11svn17476-60.2.noarch.rpm"
RPM_HASH = "ac488764799768826cd1315f7042d075caace7c65669583ff9104c6ae5ddd06a1092fcde339abd66a9c18e5a068ac7b9ad5086fe2a3e7f731614a707399b0218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uml.sty \
texlive-uml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
tex-relsize.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
