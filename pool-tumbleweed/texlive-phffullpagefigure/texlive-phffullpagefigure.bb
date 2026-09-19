SUMMARY = "Figures which fill up a whole page"
DESCRIPTION = "This package defines a figure environment which provides the \
figure content on its own page, with the corresponding caption \
reading for example 'Figure 3 (on next page): <caption>'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41857"

RPM_NAME = "texlive-phffullpagefigure-2026.226.1.0svn41857-58.2.noarch.rpm"
RPM_HASH = "778985c37d92e935e330695434bb19594f3b09de1e82e61507b46a9a8d383cf968d29d61089cd667c2a8d0f5402904a639361616a52bdaaee16bd5ddc24095a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phffullpagefigure.sty \
texlive-phffullpagefigure"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-etoolbox.sty \
tex-ifoddpage.sty \
tex-pdfpages.sty \
tex-placeins.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
