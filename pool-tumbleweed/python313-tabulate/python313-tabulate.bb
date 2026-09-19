SUMMARY = "Pretty-printer for tabular data in Python"
DESCRIPTION = "Pretty-printer for tabular data in Python. \
 \
The main use cases of the library are: \
 \
 * printing small tables without hassle: just one function call, \
   formatting is guided by the data itself \
 * authoring tabular data for lightweight plain-text markup: multiple \
   output formats suitable for further editing or transformation \
 * readable presentation of mixed textual and numeric data: smart \
   column alignment, configurable number formatting, alignment by a \
   decimal point"
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python313-tabulate-0.10.0-1.3.noarch.rpm"
RPM_HASH = "266e6f3fe7a290d5a70afdf2fe1999d42d82d9ee6fdad272b88b4ecc1c9837eb9ae3dddc1424d7a1094c4efcbe3c7eba24043cdef232d97d76bb409ee076ca02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tabulate \
python3.13dist-tabulate \
python313-tabulate \
python3dist-tabulate"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
