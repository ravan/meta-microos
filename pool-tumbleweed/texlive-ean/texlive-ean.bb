SUMMARY = "Macros for making EAN barcodes"
DESCRIPTION = "Provides EAN-8 and EAN-13 forms. The package needs the ocr-b \
fonts; note that the fonts are not available under a free \
licence, as the macros are."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn20851"

RPM_NAME = "texlive-ean-2026.226.svn20851-61.4.noarch.rpm"
RPM_HASH = "94e4187c0582573e8cf23ab4dca274caedbb5e05414ede6bdaf6c87d8f48a6dfbd19c9ca8cf244da4219f57dcb519471f184c1dc1fc88e535944cedb9b4f646a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ean13.tex \
tex-ean8.tex \
texlive-ean"

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
