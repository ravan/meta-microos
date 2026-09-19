SUMMARY = "QR Code image generator"
DESCRIPTION = "This module uses the Python Imaging Library (PIL) to allow for the generation \
of QR Codes."
LICENSE = "BSD-3-Clause"

PV = "8.2"

RPM_NAME = "python314-qrcode-8.2-1.5.noarch.rpm"
RPM_HASH = "9f0ad5647aaff61397d3e16ddcb861b62e52f41dd7a0ac5b8f2dd3c456155b7fce46320a8aa31be14df7b8d5626d24b7ef26de6d8b698a4f24755353aa03e5bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qrcode \
python314-qrcode \
python3dist-qrcode"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
