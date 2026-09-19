SUMMARY = "Library to create Barcodes with Python"
DESCRIPTION = "Library to create standard barcodes with Python. No external modules needed (optional PIL support included)."
LICENSE = "MIT"

PV = "0.16.1"

RPM_NAME = "python314-python-barcode-0.16.1-1.3.noarch.rpm"
RPM_HASH = "846779f4404baff6676bd9df7217b27ab7097141e1979df1e52f5e058744fdf7b84054af4c6ba52742e6ace20af35efe19911c6533a14d707cd48d5bd3237b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-barcode \
python314-pyBarcode \
python314-python-barcode \
python3dist-python-barcode"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
dejavu-fonts \
python-abi \
update-alternatives"

inherit rpm
