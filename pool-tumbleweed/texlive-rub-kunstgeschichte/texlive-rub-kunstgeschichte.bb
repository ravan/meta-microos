SUMMARY = "A class for the art history institute at Ruhr University Bochum"
DESCRIPTION = "This package provides a LaTeX class implementing the guidelines \
on scientific writing of the art history institute \
(Kunstgeschichtliches Institut) at Ruhr University Bochum."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn73739"

RPM_NAME = "texlive-rub-kunstgeschichte-2026.226.0.0.5.0svn73739-60.2.noarch.rpm"
RPM_HASH = "6c6573da33d000705859c3363fc5acce9773bf67b2187a710ed1a6ca62257ffa2e5632aed396deb534f221f232e126f9057ca8d137bf23a91c117d0555b027a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rub-kunstgeschichte.cls \
texlive-rub-kunstgeschichte"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-biblatex.sty \
tex-boxedminipage.sty \
tex-etoolbox.sty \
tex-forloop.sty \
tex-hyperref.sty \
tex-parskip.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
