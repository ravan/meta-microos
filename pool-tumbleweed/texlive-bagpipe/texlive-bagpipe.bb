SUMMARY = "Support for typesetting bagpipe music"
DESCRIPTION = "Typesetting bagpipe music in MusixTeX is needlessly tedious. \
This package provides specialized and re-defined macros to \
simplify this task."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.02svn34393"

RPM_NAME = "texlive-bagpipe-2026.226.3.02svn34393-60.2.noarch.rpm"
RPM_HASH = "6699ee18121612c4c7920992d4ca8e15c3feee9c74dc4bd329353011d7f6395da0a35ee86bcba21010debb03db1339a9facc03dcebbc13d26ff19f2559127878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bagpipe.tex \
texlive-bagpipe"

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
