SUMMARY = "Read support for Excel files (xls and xlsx) for agate"
DESCRIPTION = "Agate-excel adds read support for Excel files (xls and xlsx) \
to agate."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python313-agate-excel-0.4.2-1.4.noarch.rpm"
RPM_HASH = "334127619390b4a76c67c7b0579909985c4c60b43612ee756844a58b6e8815a1e46b426d5c948153e968b122f7228c52cb1bbb8cc44c77f046ac90da2c20ba15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-excel \
python3.13dist-agate-excel \
python313-agate-excel \
python3dist-agate-excel"

RDEPENDS:${PN} += "python-abi \
python313-agate \
python313-numpy \
python313-olefile \
python313-openpyxl \
python313-xlrd"

inherit rpm
