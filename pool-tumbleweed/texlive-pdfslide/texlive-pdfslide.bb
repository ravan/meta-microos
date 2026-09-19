SUMMARY = "Presentation slides using pdfTeX"
DESCRIPTION = "This is a package for use with pdfTeX, to make nice \
presentation slides. Its aims are: to devise a method for \
easier technical presentation; to help the mix of mathematical \
formulae with text and graphics which other present day \
document processing tools fail to accomplish; to exploit the \
platform independence of TeX so that presentation documents \
become portable; and to offer the freedom and possibilities of \
using various backgrounds and other embellishments that a user \
can imagine to have in as presentation. The package can make \
use of the facilities of the PPower4 post-processor."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-pdfslide-2026.226.svn15878-58.2.noarch.rpm"
RPM_HASH = "7a7ef47505fd1cc831a04a4083a974d7a1079940e196464b8a1c0d5346431e206d502c817e65437ab47a5e17dd1225fd3c6a1502af22f175e6c67f561525653b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfslide.cfg \
tex-pdfslide.sty \
tex-slide.clo \
texlive-pdfslide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-colortbl.sty \
tex-fancybox.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
