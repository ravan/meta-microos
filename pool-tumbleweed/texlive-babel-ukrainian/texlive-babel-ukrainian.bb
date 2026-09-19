SUMMARY = "Babel support for Ukrainian"
DESCRIPTION = "The package provides support for use of babel in documents \
written in Ukrainian. The support is adapted for use under \
legacy TeX engines as well as XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4esvn56674"

RPM_NAME = "texlive-babel-ukrainian-2026.226.1.4esvn56674-60.2.noarch.rpm"
RPM_HASH = "4d8b2cb64878cf3a38c79d898a508e340371db53a4d4855ef1e662f605d0afb282fd64bd101f1ad4b04bda2ebe8b049efc7dcdf38a17a756766a364644c2d4da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ukraineb.ldf \
texlive-babel-ukrainian"

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
