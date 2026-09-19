SUMMARY = "Library to create Barcodes with Python"
DESCRIPTION = "Library to create standard barcodes with Python. No external modules needed (optional PIL support included)."
LICENSE = "MIT"

PV = "0.16.1"

RPM_NAME = "python313-python-barcode-0.16.1-1.3.noarch.rpm"
RPM_HASH = "e78cce12331f74d0f1e1ecbe93ea0fd4f454f01d9b340a4e719ddac0a8a55a63ed163f056f290dd7b8d97422166690d07802d44b6475606cc4b119da256b016c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyBarcode \
python3-python-barcode \
python3.13dist-python-barcode \
python313-pyBarcode \
python313-python-barcode \
python3dist-python-barcode"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
dejavu-fonts \
python-abi \
update-alternatives"

inherit rpm
