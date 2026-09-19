SUMMARY = "A Unicode font, with rather wide coverage"
DESCRIPTION = "The package provides a set of outline (i.e. OpenType) fonts \
covering as much as possible of the Unicode character set. The \
set consists of three typefaces: one monospaced and two \
proportional (one with uniform and one with modulated stroke)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn68624"

RPM_NAME = "texlive-gnu-freefont-2026.226.svn68624-60.4.noarch.rpm"
RPM_HASH = "79c90f74a81ce8396a75d6d3325f914d60b00e47a1579b6e4b6ee94bda08e4bea6587261182b2ac123ec6e2bf5e1a84fdf44ca77cfe034755bf73f3c7ab1c7de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gnu-freefont-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
