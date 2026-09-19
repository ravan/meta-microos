SUMMARY = "Python module for converting images to PDF via direct JPEG inclusion"
DESCRIPTION = "This module losslessly converts raster images to PDF. The file size \
will not unnecessarily increase. It can, for example, be used to \
create a PDF document from a number of scans that are only available \
in JPEG format. Existing solutions would either re-encode the input \
JPEG files (leading to quality loss) or store them in the Deflate \
format which results in the PDF becoming unnecessarily large in terms \
of file size."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "python313-img2pdf-0.6.3-3.1.noarch.rpm"
RPM_HASH = "a8e0f6be18aa18f8e1c4de5d1fb45b86dbffde273832769e3ca027f0f29e16ceb33b3e0e388c7961a7ec73ab9f44ffe62bce699db9c741e09ca79a809e4481a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "img2pdf \
python3-img2pdf \
python3.13dist-img2pdf \
python313-img2pdf \
python3dist-img2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pillow \
python313-pikepdf \
update-alternatives"

inherit rpm
