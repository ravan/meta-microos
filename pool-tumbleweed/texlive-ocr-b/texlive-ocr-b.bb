SUMMARY = "Fonts for OCR-B"
DESCRIPTION = "Metafont source for OCR-B at several sizes."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20852"

RPM_NAME = "texlive-ocr-b-2026.226.svn20852-61.2.noarch.rpm"
RPM_HASH = "3fc4461fcef373e0b663e52ae20b9cd44f5db94407ae403b81f9971cd00fd654f6266a044542e9e24d03132151a2543ef38b3aed7c899581bea7b61183cd80e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocrb10.tfm \
tex-ocrb5.tfm \
tex-ocrb6.tfm \
tex-ocrb7.tfm \
tex-ocrb8.tfm \
tex-ocrb9.tfm \
texlive-ocr-b"

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
