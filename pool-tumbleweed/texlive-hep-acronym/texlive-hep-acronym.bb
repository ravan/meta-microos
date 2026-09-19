SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-acronym package provides an acronym macro based on the \
glossaries package. The package is loaded with \
\\usepackage{hep-acronym}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-acronym-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "ef9882adcbf9f590436674374607ef133e35b635d6e20925eb0837b9ce899bf92bda86b5b722f69cf027b40928cab1d1a2cf568763c2f3d7ed06a7d2f1c13d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-acronym.sty \
texlive-hep-acronym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-everyhook.sty \
tex-glossaries-extra.sty \
tex-kvoptions.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
