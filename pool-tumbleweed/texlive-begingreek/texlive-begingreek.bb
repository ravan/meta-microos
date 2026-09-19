SUMMARY = "Greek environment to be used with pdfLaTeX only"
DESCRIPTION = "This simple package defines a greek environment to be used with \
pdfLaTeX only, that accepts an optional Greek font family name \
to type its contents with. A similar \\greektxt command does a \
similar action for shorter texts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn63255"

RPM_NAME = "texlive-begingreek-2026.226.1.7svn63255-61.2.noarch.rpm"
RPM_HASH = "545f56c1f4659d50fe9cd383cbc2ccf14b8d9426edb8199dbe275f960aca3716c01b0cbd6cad6705f7f90706d30a3375d489c3b64b5145c1a57692ce9b32db43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-begingreek.sty \
texlive-begingreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
