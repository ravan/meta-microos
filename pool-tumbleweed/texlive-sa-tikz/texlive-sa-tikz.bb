SUMMARY = "TikZ library to draw switching architectures"
DESCRIPTION = "The package provides a library that offers an easy way to draw \
switching architectures and to customize their aspect."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7asvn32815"

RPM_NAME = "texlive-sa-tikz-2026.226.0.0.7asvn32815-60.2.noarch.rpm"
RPM_HASH = "eefbafbea7f17dcb439b2a2eadea2182f3e370fa1b36a9c9a49f9f1fdc6e6173430cebd108d3f50bc8fb5569c99c93c953487eec0001de08f3659a868e2f568e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sa-tikz.sty \
tex-tikzlibraryswitching-architectures.code.tex \
texlive-sa-tikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
