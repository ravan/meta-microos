SUMMARY = "University of Michigan Thesis LaTeX class"
DESCRIPTION = "A LaTeX2e class to create a University of Michigan dissertation \
according to the Rackham dissertation handbook."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn15878"

RPM_NAME = "texlive-umich-thesis-2026.226.1.20svn15878-60.2.noarch.rpm"
RPM_HASH = "887b031909244cfe3a43dcb9225b1c5997baef18d4e6050abbe883e225fe3264fb6a774515727dce05dd50e5294e1c56c02bf0aaade456f113d52cc3fce95abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-umich-thesis.cls \
texlive-umich-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-geometry.sty \
tex-placeins.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
