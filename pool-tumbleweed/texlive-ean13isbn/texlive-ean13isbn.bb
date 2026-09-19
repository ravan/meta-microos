SUMMARY = "Print EAN13 for ISBN"
DESCRIPTION = "The package provides the means to typeset ISBN codes with \
EAN-13; it uses the (generic) package ean13.tex to typeset the \
actual barcode."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn57514"

RPM_NAME = "texlive-ean13isbn-2026.226.svn57514-61.4.noarch.rpm"
RPM_HASH = "1a3b62808b3330032bb8a2e7609c809e2ae36945800727b24e7a527b6fbade632e67ff4f1011eb0dcf66b55ccf614e7e0c481e212fe5c6f7166c5fffc5b3c05f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ean13isbn.sty \
texlive-ean13isbn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
