SUMMARY = "Helps to type the pronunciation of English words"
DESCRIPTION = "This package provides macros beginning with the PS character, \
made active, which enable us to write the British or American \
English pronunciation as one can find it in the 'English \
Pronouncing Dictionary' by Daniel Jones. There is an option to \
typeset the pronunciation in the style of Harrap's dictionary."
LICENSE = "LPPL-1.0"

PV = "2026.226.2svn16558"

RPM_NAME = "texlive-engpron-2026.226.2svn16558-61.4.noarch.rpm"
RPM_HASH = "ede816ba8b9ce7df72904329e3f7c24f1ce434f6d2cd934f61cceec83b6653f2f32ea8fe1dab84a7ebba82d487265deb7721743b2574c4b8cc62d383cc507336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engpron-tools.sty \
tex-engpron.sty \
texlive-engpron"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-drac.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-tipa.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
