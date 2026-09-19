SUMMARY = "A PyQt4/PyQt5 widget for viewing and editing a DataMatrix object"
DESCRIPTION = "The qdatamatrix package provides a graphical PyQt4/PyQt5 widget to \
view and edit a DataMatrix object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.31"

RPM_NAME = "python314-python-qdatamatrix-0.1.31-2.5.noarch.rpm"
RPM_HASH = "6a3d55108bbf2284c1b392d499a53a3bdf9479bced67ec0ed39482222fdb6f15e574c5b333cb14c4352bb1e34a33702e066c1786a345a8ce766add7316aad023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-qdatamatrix \
python314-python-qdatamatrix \
python3dist-python-qdatamatrix"

RDEPENDS:${PN} += "python-abi \
python314-QtPy \
python314-python-datamatrix"

inherit rpm
