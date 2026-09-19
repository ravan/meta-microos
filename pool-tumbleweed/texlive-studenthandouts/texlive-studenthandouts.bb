SUMMARY = "Management and styling of student handout projects"
DESCRIPTION = "This package can be used to generate a single master document \
that contains a set of individual student handouts. The package \
has two main functions. First, it provides a simple framework \
for organizing handout source code, and supplies a set of \
import management tools for selectively importing a subset of \
the handouts into the master document. Selective import is \
convenient when compilation of all of the handouts is \
unnecessary, for example when working on a new handout. As a \
secondary feature, the package defines a basic visual style for \
handouts. This style can be easily changed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn43516"

RPM_NAME = "texlive-studenthandouts-2026.226.1.0svn43516-64.2.noarch.rpm"
RPM_HASH = "fb055dbc88202fd403171f5b36cc2e0bb94bc69e59cf3e604b6b1861370d329150d55ee936e30fbdd0fb4f313e8efcc0247b8994de309dc1e5a82495ca9b2e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-studenthandouts.sty \
texlive-studenthandouts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-changepage.sty \
tex-fancyhdr.sty \
tex-fmtcount.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
