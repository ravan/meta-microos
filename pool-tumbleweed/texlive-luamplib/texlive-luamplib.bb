SUMMARY = "Use LuaTeX's built-in MetaPost interpreter"
DESCRIPTION = "The package enables the user to specify MetaPost diagrams \
(which may include colour specifications from the color or \
xcolor packages) into a document, using LuaTeX's built-in \
MetaPost library. The facility is only available in PDF mode."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.39.0svn77696"

RPM_NAME = "texlive-luamplib-2026.226.2.39.0svn77696-59.2.noarch.rpm"
RPM_HASH = "4718311d4d0853c3f194e3641119558d53524dd73fa66a0f2cdab2409db481bf50638ece720834a48cb23de69bb79c17b62ea0b6f4cb90da4b9afb857333c7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamplib.sty \
texlive-luamplib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
