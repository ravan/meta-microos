SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.18.0"

RPM_NAME = "python313-prettytable-3.18.0-1.3.noarch.rpm"
RPM_HASH = "98bc337bdc9b958a93bcd9b66a1c9316161aebe4cd5620e1f564f503a8c3d90589df25deb1e02df038e2651dfbffbfb509933695bf3d6986a880dc3066394656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PrettyTable \
python3-prettytable \
python3.13dist-prettytable \
python313-PrettyTable \
python313-prettytable \
python3dist-prettytable"

RDEPENDS:${PN} += "python-abi \
python313-wcwidth"

inherit rpm
