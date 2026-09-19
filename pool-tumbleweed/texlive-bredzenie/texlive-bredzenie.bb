SUMMARY = "A Polish version of 'lorem ipsum...' in the form of a LaTeX package"
DESCRIPTION = "This is a polish version of the classic pseudo-Latin 'lorem \
ipsum dolor sit amet...'. It provides access to several \
paragraphs of pseudo-Polish generated with Hidden Markov Models \
and Recurrent Neural Networks trained on a corpus of Polish."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn44371"

RPM_NAME = "texlive-bredzenie-2026.226.1.0svn44371-59.2.noarch.rpm"
RPM_HASH = "f3fc34be28d860dccb25c05cddef3940b60b196ac80eee98cfa5e00c820358cac7b16d44b3817695dbe851340f3c4b23273b227e94278ef305914a92e45128bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bredzenie.sty \
texlive-bredzenie"

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
