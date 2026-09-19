SUMMARY = "Highlighting typographical flaws with LuaLaTeX"
DESCRIPTION = "Prints the list of pages on which typographical flaws were \
found (i.e. widows, orphans, hyphenated words split across two \
pages, consecutive lines ending with hyphens, paragraphs ending \
on too short or nearly full lines, homeoarchy, etc). \
Customisable colours are used to highlight these flaws."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.88svn77682"

RPM_NAME = "texlive-lua-typo-2026.226.0.0.88svn77682-59.2.noarch.rpm"
RPM_HASH = "7fa7da373151702433870fa0ed3463289b7e1a702a28088556f6e6393b8d8ca4fba608cebf81bbfa3205565051d06dad2f6a5e9d50c41ca1dcc18428e5dd1ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-typo-2021-04-18.sty \
tex-lua-typo-2023-03-08.sty \
tex-lua-typo.cfg \
tex-lua-typo.sty \
texlive-lua-typo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-kvoptions.sty \
tex-luacode.sty \
tex-luacolor.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
