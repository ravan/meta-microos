SUMMARY = "The Libertinus font family"
DESCRIPTION = "This is a fork of the Linux Libertine and Linux Biolinum fonts \
that started as an OpenType math companion of the Libertine \
font family, but grown as a full fork to address some of the \
bugs in the fonts. The family consists of: Libertinus Serif: \
forked from Linux Libertine. Libertinus Sans: forked from Linux \
Biolinum. Libertinus Mono: forked from Linux Libertine Mono. \
Libertinus Math: an OpenType math font for use in OpenType \
math-capable applications like LuaTeX, XeTeX or MS Word 2007+."
LICENSE = "OFL-1.1"

PV = "2026.226.7.051svn72484"

RPM_NAME = "texlive-libertinus-fonts-2026.226.7.051svn72484-61.2.noarch.rpm"
RPM_HASH = "b1671bb1c1f06f37863e39472db6a423cf972dcdc4be4241dcf98223deadc8987f091d1a472480231b4a04c5c7b9119c9c29153d5a4854e2697ac968190f5972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-fonts"

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
texlive-libertinus-fonts-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
