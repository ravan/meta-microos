SUMMARY = "Examples for python314-qtdatavis3d-qt5"
DESCRIPTION = "This package provides python314-qtdatavis3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python314-qtdatavis3d-qt5-doc-5.15.5-3.7.noarch.rpm"
RPM_HASH = "cae53cde902bf6c220a7a90f5af4214e6f86793e1e66967a3dea87e11ff1c648e93484ba657c1ed29c5c179196ca378d3e574657baa8a6217f75f3c35510628d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python313-qtdatavis3d-qt5-examples \
python314-qtdatavis3d-qt5-doc \
python314-qtdatavis3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
