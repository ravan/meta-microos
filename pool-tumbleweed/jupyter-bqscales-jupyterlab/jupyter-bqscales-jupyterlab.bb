SUMMARY = "Grammar of Graphics in Python for Jupyterlab"
DESCRIPTION = "Grammar of Graphics in Python for bqplot and other Jupyter widgets \
libraries \
 \
This package provides the jupyter lab extension."
LICENSE = "Apache-2.0"

PV = "0.3.7"

RPM_NAME = "jupyter-bqscales-jupyterlab-0.3.7-1.1.noarch.rpm"
RPM_HASH = "44a152bc41078bb9aecca0f74fc7da13fb1808dd533c0624233fba7d2a21a98ba2cf3e09624a7362ea52538671dce6f9f4b15ed294f03fdc739c62cdeeedb1fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqscales-jupyterlab"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-bqscales"

inherit rpm
