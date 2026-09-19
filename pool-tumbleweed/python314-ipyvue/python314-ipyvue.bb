SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "python314-ipyvue-1.12.0-1.3.noarch.rpm"
RPM_HASH = "7f81a26c65be8e7f7a4764b8a5c5f163faf0d3e924d7738d483c7978cf73a52a1a7b3ae6a508f1e929dca5ad3783f40f2682324e088931a2c6c936f50befda1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipyvue \
python314-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python314-ipywidgets"

inherit rpm
