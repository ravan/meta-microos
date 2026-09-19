SUMMARY = "OCR-B fonts in Type 1 and OpenType"
DESCRIPTION = "The package contains OCR-B fonts in Type1 and OpenType formats. \
They were generated from the Metafont sources of the OCR-B \
fonts. The metric files are not included here, so that original \
ocr-b package should also be installed."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20969"

RPM_NAME = "texlive-ocr-b-outline-2026.226.svn20969-61.2.noarch.rpm"
RPM_HASH = "d7968e69f90497fe5b33736fe8803018fd180c04cd61503fae4cffe4de1d01a7cbf2d4ab26b24c949c621a1365f42716c72f868cc9d90d1bc884a67db46a3ebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocrb.map \
texlive-ocr-b-outline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ocr-b-outline-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
