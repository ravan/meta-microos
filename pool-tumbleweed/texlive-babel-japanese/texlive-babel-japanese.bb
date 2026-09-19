SUMMARY = "Babel support for Japanese"
DESCRIPTION = "This package provides a japanese option for the babel package. \
It defines all the language definition macros in Japanese. \
Currently this package works with pLaTeX, upLaTeX, XeLaTeX and \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn57733"

RPM_NAME = "texlive-babel-japanese-2026.226.svn57733-60.2.noarch.rpm"
RPM_HASH = "bc432596bd053dabc245da511e6baf9ef32a5d87bb1054262eb0b3fb09865eb5ac96de96edb536419cfe4f1e4cae2d967d057827ed75c4892897d118b1a1288c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-japanese.ldf \
texlive-babel-japanese"

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
