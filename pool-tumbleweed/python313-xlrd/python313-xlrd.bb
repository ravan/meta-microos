SUMMARY = "Python module for extracting data from .xls Excel spreadsheet files"
DESCRIPTION = "A library for reading data and formatting information from Excel files \
in the historical .xls format."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python313-xlrd-2.0.2-1.3.noarch.rpm"
RPM_HASH = "4c8ca41b32552b67eca09d3d26d448047b320df9825ce6189acaf492bc34501323bdf920a8cc9fa06654b32c809a7615bf5ad4fed37923a6bf3a89ae092df910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlrd \
python3.13dist-xlrd \
python313-xlrd \
python3dist-xlrd"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
