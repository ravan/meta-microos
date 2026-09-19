SUMMARY = "Python module for extracting data from .xls Excel spreadsheet files"
DESCRIPTION = "A library for reading data and formatting information from Excel files \
in the historical .xls format."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python314-xlrd-2.0.2-1.3.noarch.rpm"
RPM_HASH = "a9ac157fe25db0edc3ccbad245f32ae320bab328c8ae2d24caf04c31885c7edad7aa77ba613b766f5ad9658ab81b94e5ad50145514535f2fdeee6885295629e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xlrd \
python314-xlrd \
python3dist-xlrd"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
