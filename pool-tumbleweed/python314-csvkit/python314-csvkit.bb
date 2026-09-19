SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python314-csvkit-2.2.0-1.2.noarch.rpm"
RPM_HASH = "e31e8e8a0e77ef63da024fe87bbe8fc0c7a520b3b0134877fec618ce7415238df7020238c41d4d7f0995aa941cf66fe5ea77f80a33e5fb20735c454219b7551d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-csvkit \
python314-csvkit \
python3dist-csvkit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-SQLAlchemy \
python314-agate \
python314-agate-dbf \
python314-agate-excel \
python314-agate-sql \
python314-openpyxl \
python314-xlrd \
update-alternatives"

inherit rpm
