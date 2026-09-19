SUMMARY = "Convenient mode selection in Beamer documents"
DESCRIPTION = "This class is a wrapper around the beamer class to make it \
easier to use the same document to generate the different forms \
of the presentation: the slides themselves, an abbreviated \
slide set for transparencies or online reference, an n-up \
handout version (various layouts are provided), and a \
transcript or set of notes using the article class. The class \
provides a variety of handout layouts, and allows the mode to \
be chosen from the command line (without changing the document \
itself)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn64182"

RPM_NAME = "texlive-beamerswitch-2026.226.1.9svn64182-61.2.noarch.rpm"
RPM_HASH = "5af66baf5db34545c0f05b87fb772bb3c77ddf32f2f3c1332710217c27bf1971b57ff8f389668eb3c434a0b8e1fbe5508a971b8ee26a4166dffbf423a440f5d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerswitch.cls \
texlive-beamerswitch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beamer.cls \
tex-beamerarticle.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-iftex.sty \
tex-pgf.sty \
tex-pgfpages.sty \
tex-shellesc.sty \
tex-xkeyval.sty \
tex-xkvltxp.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
