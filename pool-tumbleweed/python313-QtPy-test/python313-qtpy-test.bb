SUMMARY = "The qtpy.tests module"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
This subpackage separately provides the qtpy.tests module \
in order to avoid stupid rpmlint errors."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "python313-QtPy-test-2.4.3-3.2.noarch.rpm"
RPM_HASH = "de62cff111fa0b1f85e81d462343dea6ab0bb6de61cd84af1948e6eff5dd00123f25e96920aaf85576fa16ea063ea1a63698c028939d78635ba03d3b0517cd19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QtPy-test \
python313-QtPy-test"

RDEPENDS:${PN} += "python-abi \
python313-QtPy"

inherit rpm
