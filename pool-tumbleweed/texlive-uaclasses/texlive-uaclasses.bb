SUMMARY = "University of Arizona thesis and dissertation format"
DESCRIPTION = "This package provides a LaTeX2e document class named \
'ua-thesis' for typesetting theses and dissertations in the \
official format required by the University of Arizona. \
Moreover, there is a fully compatible alternative document \
class 'my-thesis' for private 'nice' copies of the \
dissertation, and the respective title pages are available as \
separate packages to work with any document class."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-uaclasses-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "6c33cf4225b2c1dd772d4f4b1e5e5da19b25882dbfd7e84c75a7523b8ac2c39fd843c894e014ab39edb9b7e8534742360ced66fad1feea8b8eaabc9b488f2bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-my-thesis.cls \
tex-my-title.sty \
tex-ua-thesis.cls \
tex-ua-title.sty \
texlive-uaclasses"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbook.cls \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
