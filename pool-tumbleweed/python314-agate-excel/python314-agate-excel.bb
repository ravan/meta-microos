SUMMARY = "Read support for Excel files (xls and xlsx) for agate"
DESCRIPTION = "Agate-excel adds read support for Excel files (xls and xlsx) \
to agate."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python314-agate-excel-0.4.2-1.4.noarch.rpm"
RPM_HASH = "e43377e7e8ff96e735b321f82b0683dcd2006363eb297083674cd8133db7cd91edff6e7c1b2443f89be60999102f3e56302384e1957f1b36a4cfc702b2d37426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-agate-excel \
python314-agate-excel \
python3dist-agate-excel"

RDEPENDS:${PN} += "python-abi \
python314-agate \
python314-numpy \
python314-olefile \
python314-openpyxl \
python314-xlrd"

inherit rpm
