SUMMARY = "Makeindex development sources"
DESCRIPTION = "The package contains the development sources of makeindex, \
which is now maintained as part of TeX Live."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-makeindex-2026.226.svn75712-59.2.noarch.rpm"
RPM_HASH = "9a8d32b9a2d0bb5cae6cbbeb06aeaea2b5e1f4b81ecf91c3dbccefd576b02a07916a5306232c6575eccef5375afd7b5d3b6cac9459f611070fed89e8394636c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-idxmac.tex \
texlive-makeindex"

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
texlive-makeindex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
