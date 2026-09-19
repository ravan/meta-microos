SUMMARY = "Symbols collection for typesetting Sequential Function Chart (SFC) diagrams (PLC programs)"
DESCRIPTION = "This package contains a collection of symbols for typesetting \
Sequential Function Chart (SFC) diagrams in agreement with the \
international standard IEC-61131-3/2013. It includes steps \
(normal and initial), transitions, actions and actions \
qualifiers (with and without time duration). It extends the \
circuit library of TikZ and allows you to draw an SFC diagram \
in same way you would draw any other circuit."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn49424"

RPM_NAME = "texlive-tikz-sfc-2026.226.1.0.1svn49424-59.2.noarch.rpm"
RPM_HASH = "fcf1fd822e516860fa0ca1dd57d6f9a4335be6834b333f40289dfa651fd5883e540c6b05178aa82d9f4273bfd6228ca45245b9b41c1c77ee397f3494e0879bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarycircuits.plc.sfc.code.tex \
texlive-tikz-sfc"

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
