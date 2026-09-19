SUMMARY = "Wrapper to use the correct libertinus package according to the used TeX engine"
DESCRIPTION = "This package is only a wrapper for the two packages \
libertinus-type1 (pdfLaTeX) and libertinus-otf \
(LuaLaTeX/XeLaTeX). The Libertinus fonts are similar to \
Libertine and Biolinum, but come with math symbols."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn77682"

RPM_NAME = "texlive-libertinus-2026.226.0.0.02svn77682-61.2.noarch.rpm"
RPM_HASH = "bf63e3d82a474b405752098e98f5618b37fbf6350d6336bdbd22a375dd40f746c67642e8ea0ae6d755db5b89fdac1c0f25a40014224009a271d34b0ba3105371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-libertinus.sty \
texlive-libertinus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
