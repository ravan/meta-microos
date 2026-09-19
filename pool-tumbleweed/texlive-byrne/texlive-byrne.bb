SUMMARY = "Typeset geometric proofs in the style of Oliver Byrne's 1847 edition of Euclid's 'Elements'"
DESCRIPTION = "This package is a LaTeX adaptation of a set of tools developed \
for ConTeXt reproduction of Oliver Byrne's 1847 edition of the \
first six books of Euclid's 'Elements'. It consists of a \
MetaPost library, responsible for all the drawing, and a set of \
LaTeX macros to conveniently use them. This package works with \
LuaLaTeX and relies on luamplib v2.23.0 or higher."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.5svn77031"

RPM_NAME = "texlive-byrne-2026.226.0.0.2.5svn77031-59.2.noarch.rpm"
RPM_HASH = "2af3e3bc0a45586402489492b322d6a5164b2eb0ecf6d539b4d5dfa37d753370720c6e197b3163dd4b3ba62c27e001744441ca43baf6be914ab03af128c2d854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-byrne.sty \
texlive-byrne"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifmtarg.sty \
tex-luamplib.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
