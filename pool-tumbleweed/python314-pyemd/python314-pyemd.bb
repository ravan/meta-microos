SUMMARY = "Python implementation of the Earth Mover's Distance"
DESCRIPTION = "PyEMD is a Python wrapper for Ofir Pele and Michael Werman's implementation \
of the Earth Mover's Distance that allows it to be used with NumPy."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-pyemd-2.0.0-1.3.noarch.rpm"
RPM_HASH = "b4ae4f1b71278e477034fd0acf90643eadcd3a0fe5b35c73627d004d2871bb21483811e1fc0cf1064b531b0b64ef604dff76d7b0eca73f1ebb95db76676b3ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyemd \
python314-pyemd \
python3dist-pyemd"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-pot"

inherit rpm
