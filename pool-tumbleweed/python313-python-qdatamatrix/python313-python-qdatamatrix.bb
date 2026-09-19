SUMMARY = "A PyQt4/PyQt5 widget for viewing and editing a DataMatrix object"
DESCRIPTION = "The qdatamatrix package provides a graphical PyQt4/PyQt5 widget to \
view and edit a DataMatrix object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.31"

RPM_NAME = "python313-python-qdatamatrix-0.1.31-2.5.noarch.rpm"
RPM_HASH = "37b9c5e1bbe3dcac28a55138079834dc7c5fac8b22f4acb1d95cad2c115280409619f462d41e0d9b4b7459864e63e920e46165ad737b638eb1d0c1874672c67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-qdatamatrix \
python3.13dist-python-qdatamatrix \
python313-python-qdatamatrix \
python3dist-python-qdatamatrix"

RDEPENDS:${PN} += "python-abi \
python313-QtPy \
python313-python-datamatrix"

inherit rpm
