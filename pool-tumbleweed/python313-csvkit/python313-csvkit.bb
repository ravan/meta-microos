SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-csvkit-2.2.0-1.2.noarch.rpm"
RPM_HASH = "d110dfd3054d8272ff0c824df640340955690fe0f65777eb956a70c83f150b1c77d35aadba739a49c9f4462675f33819742ac661869b151bd9374e333685aae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-csvkit \
python3.13dist-csvkit \
python313-csvkit \
python3dist-csvkit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-SQLAlchemy \
python313-agate \
python313-agate-dbf \
python313-agate-excel \
python313-agate-sql \
python313-openpyxl \
python313-xlrd \
update-alternatives"

inherit rpm
