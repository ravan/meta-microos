SUMMARY = "Prettier QR codes"
DESCRIPTION = "This package improves the display of QR codes provided by \
qrcode. The Quick Response (QR) codes provided by package \
qrcode show white borders on each square (from little to very \
prominent, depending on the pdf viewer). This is because the QR \
code is printed square by square, not the connected regions of \
squares as such, and pdf screen viewers show these undesired \
borders. This package overwrites the qrcode printing functions \
to fill connected regions of the QR code using TikZ, allowing \
prettier qrcodes on screen visualization, with possibility of \
customization."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-qrcodetikz-2026.226.1.0svn76924-60.4.noarch.rpm"
RPM_HASH = "6d607102febe2d7966811c3895305e26b0982711bd06331f01a82d79d5985e3e04a29c6837a2770c9933cca5a56907e3b27a089e9fe955b9ab6f301337ef12b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qrcodetikz.sty \
texlive-qrcodetikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-qrcode.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
