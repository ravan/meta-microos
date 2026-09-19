SUMMARY = "Unicode data and loaders for TeX"
DESCRIPTION = "This bundle provides generic access to Unicode Consortium data \
for TeX use. It contains a set of text files provided by the \
Unicode Consortium which are currently all from Unicode 8.0.0, \
with the exception of MathClass.txt which is not currently part \
of the Unicode Character Database. Accompanying these source \
data are generic TeX loader files allowing this data to be used \
as part of TeX runs, in particular in building format files. \
Currently there are two loader files: one for general character \
set up and one for initialising XeTeX character classes as has \
been carried out to date by unicode-letters.tex. The source \
data are distributed in accordance with the license stipulated \
by the Unicode Consortium. The bundle as a whole is \
co-ordinated by the LaTeX3 Project as a general resource for \
TeX users."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn76413"

RPM_NAME = "texlive-unicode-data-2026.226.1.19svn76413-60.2.noarch.rpm"
RPM_HASH = "09a9a5d8759aa65dcafa1b14de78f12eaf44776292fdff4067de3b65b5e77c02b148b3ac4d9911fcd3153dadf0b56b9103e2c57fd1c57a81a19beb63600de5cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-load-unicode-data.tex \
tex-load-unicode-math-classes.tex \
tex-load-unicode-xetex-classes.tex \
texlive-unicode-data"

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
