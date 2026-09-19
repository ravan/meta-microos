SUMMARY = "Typing stubs for python-dateutil"
DESCRIPTION = " \
 \
This is a PEP 561 type stub package for the `python-dateutil` package. It \
can be used by type-checking tools like"
LICENSE = "Apache-2.0"

PV = "2.9.0.20260305"

RPM_NAME = "python314-types-python-dateutil-2.9.0.20260305-1.3.noarch.rpm"
RPM_HASH = "e53c56ceea1d5749fcad1904e91c9f766f4ad6378fb2266e3eccd9d58fc62075ec45f1395d5cbc0c666f31c8a9c2d4920a5a49cad144b35e27a63b7b5a96f7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-types-python-dateutil \
python314-types-python-dateutil \
python3dist-types-python-dateutil"

RDEPENDS:${PN} += ""

inherit rpm
