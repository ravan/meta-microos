SUMMARY = "The qtpy.tests module"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
This subpackage separately provides the qtpy.tests module \
in order to avoid stupid rpmlint errors."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "python314-QtPy-test-2.4.3-3.2.noarch.rpm"
RPM_HASH = "c8f1855933e30d7943f7c0a230f11ee3864fa4b29a1c6c94804b66bac00cc9bfb7b743fdb22e79f2e42f8d6aa9f928db211a3cdda0f7633193fc530e374e0df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-QtPy-test"

RDEPENDS:${PN} += "python-abi \
python314-QtPy"

inherit rpm
