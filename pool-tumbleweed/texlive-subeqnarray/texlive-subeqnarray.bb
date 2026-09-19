SUMMARY = "Equation array with sub numbering"
DESCRIPTION = "This package defines the subeqnarray and subeqnarray* \
environments, which behave like the corresponding eqnarray and \
eqnarray* environments, except that the individual lines are \
numbered like 1a, 1b, 1c, etc. To refer to these numbers an \
extra label command \\slabel is provided. Users are urged to \
consider the alignment capabilities of the amsmath bundle, \
which produce better results than eqnarray-related macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1fsvn77682"

RPM_NAME = "texlive-subeqnarray-2026.226.2.1fsvn77682-64.2.noarch.rpm"
RPM_HASH = "31091082dc874770450e7b73ecb18c701acf28949871b7bbfda8ca9577bbf9892ab0eb343c7b28b1ebccd0935e8bddb1d862afc44f5994d1f2125a97cb86678a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subeqnarray.sty \
texlive-subeqnarray"

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
