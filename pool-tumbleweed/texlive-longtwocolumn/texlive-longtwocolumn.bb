SUMMARY = "A twocolumn alternative allowing automatic page breaks"
DESCRIPTION = "This package provides a command \\longtwocolumn similar to the \
LaTeX kernel command \\twocolumn, but it allows the optional \
argument to span several pages. The package is an adaption of \
an old KOMA-Script forum entry."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn75852"

RPM_NAME = "texlive-longtwocolumn-2026.226.0.0.1svn75852-61.2.noarch.rpm"
RPM_HASH = "f38a350413f983369fe2f6f1d64b5ed0eac7e6746575d73eebfa275c574bc07d0f650301b7bbc78040a61d12bb3e904eabb2b3ac16a2bc72bf5e8598192d3c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longtwocolumn.sty \
texlive-longtwocolumn"

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
