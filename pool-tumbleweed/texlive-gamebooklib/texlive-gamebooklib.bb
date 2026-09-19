SUMMARY = "Macros for setting numbered entries in shuffled order"
DESCRIPTION = "This package provides macros and environments to allow the user \
to typeset a series of cross-referenced, numbered 'entries', \
shuffled into random order, to produce an interactive novel or \
'gamebook'. This allows entries to be written in natural order \
and shuffled automatically into a repeatable non-linear order. \
Limited support is provided for footnotes to appear at the \
natural position: the end of each entry, or the end of each \
page, whichever is closest to the footnote mark. This is \
unrelated to the gamebook package which is more concerned with \
the formatting of entries rather than their order. The two \
packages can be used together or separately."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn67772"

RPM_NAME = "texlive-gamebooklib-2026.226.1.4svn67772-60.2.noarch.rpm"
RPM_HASH = "88852b3a4ce1b2758aba2871d834cbfa44b0e5cdbbb9d624bab62a309931d7c05fd802a7ae160f7c9c3de17bdc58d6811aa560a1f2d8cdebb0292469814f5537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gamebooklib.sty \
texlive-gamebooklib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-ifthen.sty \
tex-lcg.sty \
tex-macroswap.sty \
tex-silence.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
