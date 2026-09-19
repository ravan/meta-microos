SUMMARY = "Generate marginpar-equivalent PDF annotations"
DESCRIPTION = "The package provides the \\pdfmarginpar command which is similar \
in spirit to \\marginpar. However, it creates PDF annotations \
which may be viewed with Adobe Reader in place of marginal \
texts. Small icons indicate the in-text position where the \
message originates, popups provide the messages themselves. \
Thus bugfixes and other such communications are clearly visible \
together when viewing the document, while the document itself \
is not obscured."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.92svn77682"

RPM_NAME = "texlive-pdfmarginpar-2026.226.0.0.92svn77682-58.2.noarch.rpm"
RPM_HASH = "7366d5a760ac7ddeae68bdbd168dba80e6f03583b3cb77a0945ffcfcec56a472e447fb3cbd49f277c5ac1bb44e31b8fe717a5b1498170a66067008bcee125c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfmarginpar.sty \
texlive-pdfmarginpar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
