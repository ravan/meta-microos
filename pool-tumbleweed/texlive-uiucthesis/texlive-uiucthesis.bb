SUMMARY = "UIUC thesis class"
DESCRIPTION = "The class produces a document that conforms to the format \
described in the University's Handbook for Graduate Students \
Preparing to Deposit."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.25svn15878"

RPM_NAME = "texlive-uiucthesis-2026.226.2.25svn15878-60.2.noarch.rpm"
RPM_HASH = "747e02dda1d60a1678bc24f005c0767e5b7e1c479148c9c83d415c7738585cc82ee9882a63241fc24e4c85e405b1c2282e24db12d36985e2c38773659d625326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uiucthesis.cls \
tex-uiucthesis.sty \
texlive-uiucthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
