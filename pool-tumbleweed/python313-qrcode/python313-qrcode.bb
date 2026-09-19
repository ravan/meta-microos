SUMMARY = "QR Code image generator"
DESCRIPTION = "This module uses the Python Imaging Library (PIL) to allow for the generation \
of QR Codes."
LICENSE = "BSD-3-Clause"

PV = "8.2"

RPM_NAME = "python313-qrcode-8.2-1.5.noarch.rpm"
RPM_HASH = "4b51f05d22be89e0cec0f20698babfb5a3dcbee65dbabb31373cf0ba7428be35035ed0f6430f29af113a08d1302c4afb71405a65c01a8afbdb2d7d1e1a3681dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qrcode \
python3.13dist-qrcode \
python313-qrcode \
python3dist-qrcode"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
