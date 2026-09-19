SUMMARY = "Babel support for Welsh"
DESCRIPTION = "The package provides the language definition file for Welsh. \
(Mostly Welsh-language versions of the standard names in a \
LaTeX file.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1csvn77682"

RPM_NAME = "texlive-babel-welsh-2026.226.1.1csvn77682-60.2.noarch.rpm"
RPM_HASH = "202eae2429c1d6fbd29403a60afc34cb62a2365c163d8b49c95c6b91a107a85d9464a1e0b6b914c29b1debb587f3eeffd18eae9af78e0a8082661fa5211c1026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-welsh.ldf \
texlive-babel-welsh"

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
