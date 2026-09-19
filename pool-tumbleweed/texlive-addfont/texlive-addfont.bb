SUMMARY = "Easier use of fonts without LaTeX support"
DESCRIPTION = "This package is intended for use by users who know about fonts. \
It is a quick-fix for fonts which do not have genuine LaTeX \
support. It is not meant as a replacement of the LaTeX font \
definition files. It is meant as something more useable for \
LaTeX users than the \\newfont command. With addfont the loaded \
font scales along with the usual LaTeX size selection. Using \
this package still requires some knowledge on how to use fonts \
with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn58559"

RPM_NAME = "texlive-addfont-2026.226.1.1svn58559-61.2.noarch.rpm"
RPM_HASH = "6b8a9007f1062e458bca03701ccfdda0e75ef00dd21996208fdad5c4b575533e671c07e7a20f45efda465a50e4446d315c6cb9dadc539536f6aad32dfd97b121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-addfont.sty \
texlive-addfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-twoopt.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
