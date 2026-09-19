SUMMARY = "Support for Libertinus OpenType"
DESCRIPTION = "This package offers LuaLaTeX/XeLaTeX support for the Libertinus \
OpenType fonts maintained by Khaled Hosny. Missing fonts are \
defined via several font feature settings. The Libertinus fonts \
are similar to Libertine and Biolinum, but come with math \
symbols."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.34svn77682"

RPM_NAME = "texlive-libertinus-otf-2026.226.0.0.34svn77682-61.2.noarch.rpm"
RPM_HASH = "0e455210b94f474354a4644bec48442c3e1dd4d50557bbe1fe64b75d92cd2cca10058d84d9a5e48a5e5363698028fcd4ddabdda58a01123f2224637c25ad6099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-libertinus-otf.sty \
texlive-libertinus-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-lua-unicode-math.sty \
tex-newunicodechar.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
