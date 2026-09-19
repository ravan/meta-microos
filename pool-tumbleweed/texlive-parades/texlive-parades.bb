SUMMARY = "Tabulators and space between paragraphs in galley approach"
DESCRIPTION = "The LaTeX package paravesp controls the spaces above and below \
paragraphs. The python script parades.py generates paragraph \
styles with support of space above, space below and tabulators. \
The system imposes the galley approach on the document."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn40042"

RPM_NAME = "texlive-parades-2026.226.svn40042-58.2.noarch.rpm"
RPM_HASH = "887f1baaaf14da0d488627ef4da910ab2312a9793cdfaa2a6b7734757c39fadf0d798a835875c5b588bd505c14dab7bb56a600b4b202622347596a3f2779c731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paravesp.sty \
texlive-parades"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
