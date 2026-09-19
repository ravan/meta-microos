SUMMARY = "Typeset newsletters to resemble newspapers"
DESCRIPTION = "The newspaper package redefines the page style and \\maketitle \
command to produce a typeset page similar to that of a \
newspaper. It also provides several commands that (when used \
with other packages) simplify the writing of articles in a \
newspaper-style column format."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-newspaper-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "daf5e839fff093e5f55a8d799f184a85d8e8173a14baf78c31544eeafd379fa98dd25dcd9bbb68b2de87850ad1d547a22bf3034575a17ec6f68edd626aa52a9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newspaper.sty \
texlive-newspaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-yfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
