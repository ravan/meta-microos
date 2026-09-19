SUMMARY = "Document class for IEEE Transactions journals and conferences"
DESCRIPTION = "The class and its BibTeX style enable authors to produce \
officially-correct output for the Institute of Electrical and \
Electronics Engineers (IEEE) transactions, journals and \
conferences."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8bsvn59672"

RPM_NAME = "texlive-ieeetran-2026.226.1.8bsvn59672-60.2.noarch.rpm"
RPM_HASH = "c1f705d8a3c3f618cca969cf4dbf8e9104d2dbc3542d53ef4bc03b2dd8c69e5cbc72f54cde20ce4e2668855895db3a95ca30885927ef1078fa449331817e4c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-IEEEtran.cls \
tex-IEEEtrantools.sty \
texlive-ieeetran"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-newtxmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
