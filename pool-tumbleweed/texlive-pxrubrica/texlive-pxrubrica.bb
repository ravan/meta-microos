SUMMARY = "Ruby annotations according to JIS X 4051"
DESCRIPTION = "This package provides a function to add ruby annotations \
(furigana) that follow the style conventional in Japanese \
typography as described in the W3C technical note 'Requirements \
for Japanese Text Layout' ([JLREQ]) and the JIS specification \
JIS X 4051. Starting with version 1.3, this package also \
provides a function to add kenten (emphasis marks) to Japanese \
text."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3esvn66298"

RPM_NAME = "texlive-pxrubrica-2026.226.1.3esvn66298-60.4.noarch.rpm"
RPM_HASH = "22128a3e87c82922459793fc89521274e4e02a9b742471a01fd26ebf4ec4cb4ed4f7355417e663110c24fe6fd8e467929a00475a6208f2c98c2cc92c1ab25e4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxrubrica.sty \
texlive-pxrubrica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
