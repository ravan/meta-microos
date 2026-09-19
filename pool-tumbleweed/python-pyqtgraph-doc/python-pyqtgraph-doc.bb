SUMMARY = "Documentation for python-pyqtgraph"
DESCRIPTION = "Documentation and help files for python-pyqtgraph"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python-pyqtgraph-doc-0.14.0-3.2.noarch.rpm"
RPM_HASH = "54a80bd87f4c80729bbec1d57c0f0d7acbe6996f73c034d4a7d2217a2492a8186267faddec12dee138934f227d01b14c9dec6dc1f52bcf073b281dba06544316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyqtgraph-doc \
python313-python-pyqtgraph \
python314-python-pyqtgraph"

RDEPENDS:${PN} += ""

inherit rpm
