SUMMARY = "Fancy QR-Codes with TikZ"
DESCRIPTION = "A simple package to create fancy QR-codes with the help of the \
qrcode package (no PGF/TikZ used)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn78199"

RPM_NAME = "texlive-fancyqr-2026.226.2.3svn78199-59.2.noarch.rpm"
RPM_HASH = "643a9ee9abb1c525fb76cba109f74640d386f3a966615ba48776bcf4ebeeabfed7d1bcb3af644a878bcbcb38990950f0db45906dbd2e662aaa626a0f4db8974b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyqr.sty \
texlive-fancyqr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
tex-qrcode.sty \
tex-xfp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
