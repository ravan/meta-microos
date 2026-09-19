SUMMARY = "Typeset numbers"
DESCRIPTION = "A LaTeX package for typesetting numbers, in particular floating \
point numbers, such as you find in program output."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.92svn15878"

RPM_NAME = "texlive-fancynum-2026.226.0.0.92svn15878-59.2.noarch.rpm"
RPM_HASH = "ab05c3be488b3f6a48024753431f4adbac07c0ed76ec4810ea019794376e0f64111b76c39146a0508aa409354c300cf576c9f128eedc890491d517cf73afdfcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancynum.sty \
texlive-fancynum"

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
