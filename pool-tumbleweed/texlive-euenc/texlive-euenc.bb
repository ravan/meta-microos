SUMMARY = "Unicode font encoding definitions for XeTeX"
DESCRIPTION = "Font encoding definitions for unicode fonts loaded by LaTeX in \
XeTeX or LuaTeX. The package provides two encodings: EU1, \
designed for use with XeTeX, which the fontspec uses for \
unicode fonts which require no macro-level processing for \
accents, and EU2, which provides the same facilities for use \
with LuaTeX. Neither encoding places any restriction on the \
glyphs provided by a font; use of EU2 causes the package \
euxunicode to be loaded (the package is part of this \
distribution). The package includes font definition files for \
use with the Latin Modern OpenType fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1hsvn19795"

RPM_NAME = "texlive-euenc-2026.226.0.0.1hsvn19795-59.2.noarch.rpm"
RPM_HASH = "eeca298b7431e493ea656d6cdae2ad15efdaf4b43d75b38dfe7f1e12d43b70d3ea526f8430662c77f52f835e02390c573a62e49fd2d74e992ef2008facc22286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eu1enc.def \
tex-eu1lmdh.fd \
tex-eu1lmr.fd \
tex-eu1lmss.fd \
tex-eu1lmssq.fd \
tex-eu1lmtt.fd \
tex-eu1lmvtt.fd \
tex-eu2enc.def \
tex-eu2lmdh.fd \
tex-eu2lmr.fd \
tex-eu2lmss.fd \
tex-eu2lmssq.fd \
tex-eu2lmtt.fd \
tex-eu2lmvtt.fd \
texlive-euenc"

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
