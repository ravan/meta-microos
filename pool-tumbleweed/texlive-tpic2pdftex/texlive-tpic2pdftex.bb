SUMMARY = "Use tpic commands in pdfTeX"
DESCRIPTION = "This AWK script converts pic language, embedded inline \
(delimited by .PS and .PE markers), to \\pdfliteral commands. It \
is now maintained as part of TeX Live."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-tpic2pdftex-2026.226.svn75712-59.2.noarch.rpm"
RPM_HASH = "514aa762105550e1e5ce180914cd72ddf3e2720d5c1e3834e9f42d3b016115710385bc428ab34a8dc8e01642c6dd9defe842f32315c9f01d26bee995d278a6da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-tpic2pdftex.1 \
texlive-tpic2pdftex"

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
texlive-scripts-bin \
texlive-tpic2pdftex-bin"

inherit rpm
