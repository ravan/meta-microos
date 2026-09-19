SUMMARY = "Alphanumeric section numbering"
DESCRIPTION = "This package allows you to use alphanumeric section numbering, \
for instance 'A. Introduction ... III. International Law'. Its \
output is similar to alphanum, but you can use the standard \
LaTeX sectioning commands, so that it is possible to switch \
numbering schemes easily. Greek letters, double letters (bb) \
and different delimiters around them are supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn77682"

RPM_NAME = "texlive-alnumsec-2026.226.0.0.03svn77682-61.2.noarch.rpm"
RPM_HASH = "f71c0b2eddc0e1344334e172b0a87970e5a7663721e0eefa444c1e9879e9d3d9891a5497ac5594bb49908525429e98d411098ee86fc0503b7fe86b4aa9205e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alnumsec.sty \
texlive-alnumsec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
