SUMMARY = "IEEE Power Engineering Society Transactions"
DESCRIPTION = "Supports typesetting of transactions, as well as discussions \
and closures, for the IEEE Power Engineering Society \
Transactions journals."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn17359"

RPM_NAME = "texlive-ieeepes-2026.226.4.0svn17359-60.2.noarch.rpm"
RPM_HASH = "c7f40bc6a4f9babac727574ec9dc3e168dfec86056b375076032c002ce8924e63d0862544cf0e422985abcb096c0e5cc3d7ab75603f24851c4480b9e0ccd2f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ieeepes.sty \
texlive-ieeepes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-mathptm.sty \
tex-times.sty \
tex-vmargin.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
