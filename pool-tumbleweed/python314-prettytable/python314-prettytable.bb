SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.18.0"

RPM_NAME = "python314-prettytable-3.18.0-1.3.noarch.rpm"
RPM_HASH = "d733f51e823132b9969acb566db49db616f544f1f5349ac998f4832ac2e77e7227c061028b1513a67f9d8e312dfaa2f98da801b928be0b93894195a12dfd0f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-prettytable \
python314-PrettyTable \
python314-prettytable \
python3dist-prettytable"

RDEPENDS:${PN} += "python-abi \
python314-wcwidth"

inherit rpm
