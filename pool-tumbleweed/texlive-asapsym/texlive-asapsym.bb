SUMMARY = "Using the free ASAP Symbol font with LaTeX and Plain TeX"
DESCRIPTION = "The package provides macros (usable with LaTeX or Plain TeX) \
for using the freely available ASAP Symbol font, which is also \
included. The font is distributed in OpenType format, and makes \
extensive use of OpenType features. Therefore, at this time, \
only XeTeX and LuaTeX are supported. An error message is issued \
if an OTF-capable engine is not detected."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn40201"

RPM_NAME = "texlive-asapsym-2026.226.1.0svn40201-60.2.noarch.rpm"
RPM_HASH = "3be0e2139c7bb63114b683470f542ca6a98426f849ae122f703a24ba292cc3e63f124f386aa9c2d08291deac1fde4b063445766e00df837ca337021f500a6d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asapsym-generic.tex \
tex-asapsym.code.tex \
tex-asapsym.sty \
texlive-asapsym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-asapsym-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
