SUMMARY = "Data analysis library optimized for humans instead of machines"
DESCRIPTION = "Agate is a Python data analysis library that is optimized for humans \
instead of machines. It is an alternative to numpy and pandas that \
solves real-world problems with readable code. \
 \
Agate was previously known as journalism."
LICENSE = "MIT"

PV = "1.14.2"

RPM_NAME = "python314-agate-1.14.2-1.3.noarch.rpm"
RPM_HASH = "fd9673c23c64a23fa48d3dedcaa1b325e63b0df9d2c3998bea5c3741ff94fde771db941eeeab59dcecb7583763fe269ca047690d5bc61aa3c0c343f0af7bc8af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-agate \
python314-agate \
python3dist-agate"

RDEPENDS:${PN} += "python-abi \
python314-Babel \
python314-isodate \
python314-leather \
python314-parsedatetime \
python314-python-slugify \
python314-pytimeparse"

inherit rpm
