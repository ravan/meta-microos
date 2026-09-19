SUMMARY = "Typeset a swung dash in LaTeX"
DESCRIPTION = "The swung dash (U+2053) is a useful character traditionally \
used in typesetting dictionaries, but not supported by most \
typefaces. This package provides one simple command to typeset \
a swung dash in XeLaTeX and LuaLaTeX, by applying \
transformations to the given font's glyph for a tilde."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn76924"

RPM_NAME = "texlive-swungdash-2026.226.1.0.0svn76924-64.2.noarch.rpm"
RPM_HASH = "998327c4fcfa4b4e02586adfea61093f04c8156f0dd012450246a1d6ad54a8bff4d7f263cb9cef49de63ac19872ab94e79bedfbac188b3c9caabeb653cfa88b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swungdash.sty \
texlive-swungdash"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-graphicx.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
