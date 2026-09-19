SUMMARY = "Insert a QR code in the margin"
DESCRIPTION = "This package allows to draw an URL as a QR code into the margin \
of a one- or twosided document. The following packages are \
loaded by default: qrcode, marginnote, url, xcolor and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.09svn71361"

RPM_NAME = "texlive-hvqrurl-2026.226.0.0.09svn71361-60.2.noarch.rpm"
RPM_HASH = "170a094e58ed5bb51611b54a4e980b51ef3879e6ffd8d287d8ce859bd093d3be47c7ed6a33404166ef365dab5845c00d6d11415ca1632c4c6fc1cc19a7755867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvqrurl.sty \
texlive-hvqrurl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-marginnote.sty \
tex-qrcode.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
