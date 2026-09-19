SUMMARY = "Support for parsing XML documents"
DESCRIPTION = "The package provides an implementation of a parser for \
documents matching the XML 1.0 and XML Namespace \
Recommendations. In addition to parsing commands are provided \
to attach TeX typesetting instructions to the various markup \
elements as they are encountered. Sample files for typesetting \
a subset of TEI, MathML, are included. Element and Attribute \
names, as well as character data, may use any characters \
allowed in XML, using UTF-8 or a suitable 8-bit encoding."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn76924"

RPM_NAME = "texlive-xmltex-2026.226.0.0.8svn76924-59.4.noarch.rpm"
RPM_HASH = "e4e4826bec9347ca0a116121687fc7ed9836c2eae1cc1f40c5565b6e40236673495a0bfe3373b90c34d1ba6052643e7f683b1a3db7d9a91cf978f88ee4335a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xmltex.cfg \
tex-xmltex.tex \
texlive-xmltex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-babel \
texlive-cm \
texlive-dehyph \
texlive-filesystem \
texlive-firstaid \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-latex \
texlive-latex-fonts \
texlive-pdftex \
texlive-scripts \
texlive-scripts-bin \
texlive-tex \
texlive-tex-ini-files \
texlive-unicode-data \
texlive-xmltex-bin"

inherit rpm
