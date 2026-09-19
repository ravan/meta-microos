SUMMARY = "SAS(R) user group conference proceedings document class"
DESCRIPTION = "The class may be used to typeset articles to be published in \
the proceedings of SAS(R) User group conferences and workshops. \
The layout produced by the class is based on that published by \
SAS Institute (2021)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn58752"

RPM_NAME = "texlive-sugconf-2026.226.svn58752-64.2.noarch.rpm"
RPM_HASH = "dcc747af259b659ece134919b5420bfd8af781d4a4822d84de0ec26fecee1f04f7f773cd1f483ac33f094cab7ca558cd44dc54bae2c2c6ddff66456016373c31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sugconf.cls \
texlive-sugconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
