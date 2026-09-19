SUMMARY = "Cheat sheet outlining the most common TeX font errors"
DESCRIPTION = "This is a compact three-pages document highlighting the TeX \
flow of integrating fonts, and explains how some of the most \
common font-related error messages occur. Also, hints are given \
on how to address those."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn18314"

RPM_NAME = "texlive-tex-font-errors-cheatsheet-2026.227.0.0.1svn18314-62.2.noarch.rpm"
RPM_HASH = "56509f6b8fa30c8badc43f02a5a71142c79f12c1768106e50a159803b1a2d61665d5cdb24d5fd21c35279fcd901a5a8bb80d54823e7a682b6d036ca14eb1e15c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-font-errors-cheatsheet"

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
