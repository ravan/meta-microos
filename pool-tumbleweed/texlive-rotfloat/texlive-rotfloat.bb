SUMMARY = "Rotate floats"
DESCRIPTION = "The float package provides commands to define new floats of \
various styles (plain, boxed, ruled, and userdefined ones); the \
rotating package provides new environments (sidewaysfigure and \
sidewaystable) which are rotated by 90 or 270 degrees. But what \
about new rotated floats, e.g. a rotated ruled one? This \
package makes this possible; it builds a bridge between the two \
packages and extends the commands from the float package to \
define rotated versions of the new floats, too."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-rotfloat-2026.226.1.2svn77682-60.2.noarch.rpm"
RPM_HASH = "1c82d1237c805bfabc3026e1021b12b7015a99d01cb6c77a21ea2249b89d69ebd7c0795f4fbfa2c273f4db38e1043ed3d788c7f8ea860c3c93ad60c6783c96ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rotfloat.sty \
texlive-rotfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
