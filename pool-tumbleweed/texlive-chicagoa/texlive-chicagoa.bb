SUMMARY = "'Chicago' bibliography style with annotations"
DESCRIPTION = "This is a modification of the author's chicago style, to \
support an 'annotation' field in bibliographies."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-chicagoa-2026.226.svn76790-60.2.noarch.rpm"
RPM_HASH = "55e639615296efb949479c0600baef80f1a346b9b8eee57330d256a6a9eadb2ff2cef6943ac70b27a22012a1fb7e891d2bc2134e6b17ce77da6640ff5ee0ea13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicagoa"

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
