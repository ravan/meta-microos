SUMMARY = "Typeset a basic 2-octave piano diagram"
DESCRIPTION = "This package adds the \\keyboard[1][2]..[7] command to your \
project. When used, it draws a small 2 octaves piano keyboard \
on your document, with up to 7 keys highlighted. Keys go : Co, \
Cso, Do, Dso, Eo, Fo, Fso, Go, Gso, Ao, Aso, Bo, Ct, Cst, Dt, \
Dst, Et, Ft, Fst, Gt, Gst, At, Ast and Bt. (A working example \
is included in the README file.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-piano-2026.226.1.0svn77682-58.2.noarch.rpm"
RPM_HASH = "a128dbf89bb8671cb95f751dba65293d578e35dc6d52ef3ab20341783b608554c8be45b1a94072abe764c20b6d45945efc2215a819af5a9b2f737afaa1c23776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-piano.sty \
texlive-piano"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifthen.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
