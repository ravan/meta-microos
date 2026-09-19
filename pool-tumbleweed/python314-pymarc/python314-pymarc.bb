SUMMARY = "MARC bibliographic data manipulation module"
DESCRIPTION = "pymarc is a Python library for working with bibliographic data \
encoded in MARC21. It provides an API for reading, writing and \
modifying MARC records. It was originally designed to be an emergency \
eject seat for getting data assets out of MARC and into some kind of \
saner representation."
LICENSE = "BSD-2-Clause"

PV = "5.3.1"

RPM_NAME = "python314-pymarc-5.3.1-1.5.noarch.rpm"
RPM_HASH = "3249fd4740fb795f12dd9d99d88d54126533fb0c29ccaa8d0d81dae0a6ec3b1f1830e27974e38ca73d9b2909f3d1e1a54cf0c1ac40031ee55bda3ecc33efdba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymarc \
python314-pymarc \
python3dist-pymarc"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
