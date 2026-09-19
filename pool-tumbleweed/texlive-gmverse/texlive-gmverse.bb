SUMMARY = "A package for typesetting (short) poems"
DESCRIPTION = "A redefinition of the verse environment to make the \\\\ command \
optional for line ends and to give it a possibility of optical \
centering and `right-hanging' alignment of lines broken because \
of length."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-2026.226.0.0.73svn29803-60.4.noarch.rpm"
RPM_HASH = "d5175b8c80a5cdabff463e22d671b270c6a5ff3aa2bae63a92cf18b94023e0ccae138a4b9858f482e4f8fc2b6044a9e7e7b0392098499e3313f29383c13b8299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmverse.sty \
texlive-gmverse"

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
