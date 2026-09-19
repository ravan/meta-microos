SUMMARY = "CIE color space"
DESCRIPTION = "pst-cie is a PSTricks related package to show the different CIE \
color spaces: Adobe, CIE, ColorMatch, NTSC, Pal-Secam, \
ProPhoto, SMPTE, and sRGB."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06bsvn60959"

RPM_NAME = "texlive-pst-cie-2026.226.1.06bsvn60959-59.2.noarch.rpm"
RPM_HASH = "15fb703f1e49918a5d4059df2945886846f5369d05f75080e3ebc2249948665b0f9cf2bed9c903eb37d763ccfd322e92ecec8b457f2581d9ae9e9d0812cc6a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-cie.sty \
tex-pst-cie.tex \
texlive-pst-cie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
