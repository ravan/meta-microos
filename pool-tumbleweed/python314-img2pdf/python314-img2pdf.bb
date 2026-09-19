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

RPM_NAME = "python314-img2pdf-0.6.3-3.1.noarch.rpm"
RPM_HASH = "144c5d2ec0386eaa9401847cb1e458bd7d9cdbe1193f94cbdaf90c3d61ab2956a63ae30a78ec1fabcb7098262da8786089b20c34fdb82ed2116bdaf0e0da98d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-img2pdf \
python314-img2pdf \
python3dist-img2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pillow \
python314-pikepdf \
update-alternatives"

inherit rpm
