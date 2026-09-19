SUMMARY = "A LaTeX bundle for typesetting dissertations"
DESCRIPTION = "The udiss bundle is a LaTeX-class-file developed to assist \
students in typesetting their university dissertations. It is a \
collection of multiple support files. Universities often have \
strict requirements regarding the formatting of the \
dissertations/theses submitted to them. This bundle \
pre-supplies a generic style (university-agnostic) for creating \
dissertations. It also supports custom layouts required for \
different universities."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1svn75301"

RPM_NAME = "texlive-udiss-2026.226.0.0.1svn75301-60.2.noarch.rpm"
RPM_HASH = "5a9d3822eafa3382c52ca68f2e9d74fc412159d37ddf7a5405fee16c35e3a3ca7588fe82b228b1c2ded91ec45971ed0161b314e66da27ad120488c88287463ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-udiss.cls \
texlive-udiss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-csquotes.sty \
tex-expkv-def.sty \
tex-expkv-opt.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-iflang.sty \
tex-iftex.sty \
tex-memoir.cls \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
