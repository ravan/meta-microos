SUMMARY = "Grammar of Graphics in Python for Classic Jupyter Notebooks"
DESCRIPTION = "Grammar of Graphics in Python for bqplot and other Jupyter widgets \
libraries \
 \
This package provides the jupyter notebook extension."
LICENSE = "Apache-2.0"

PV = "0.3.7"

RPM_NAME = "jupyter-bqscales-notebook-0.3.7-1.1.noarch.rpm"
RPM_HASH = "3cf9a278b01194b1ace8aad0e7605ca1d2d604260e642e2630598fdc6329bef68c500e8cffa39ea74c7a901255cb7647887db6fb0b407a334ab48274c17291e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqscales-notebook"

RDEPENDS:${PN} += "jupyter-nbclassic \
python3dist-bqscales"

inherit rpm
