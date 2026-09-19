SUMMARY = "Separate color stack for footnotes with pdfTeX"
DESCRIPTION = "Since version 1.40 pdfTeX supports several colour stacks. This \
package uses a separate colour stack for footnotes that can \
break across pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-pdfcolfoot-2026.226.1.4svn77682-58.2.noarch.rpm"
RPM_HASH = "0f696c8fe2180b68386fad8c6a98c6b45958dfad8888de2d3b9e94cbb6f98a3061df4e59ed342a079c58e6aa1489e42960df0b3c5c68523ed82194adbaa6d47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcolfoot.sty \
texlive-pdfcolfoot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdfcol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
