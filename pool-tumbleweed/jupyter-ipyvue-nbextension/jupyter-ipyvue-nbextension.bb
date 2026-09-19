SUMMARY = "Jupyter widgets base for Vue libraries - nbextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "jupyter-ipyvue-nbextension-1.12.0-1.3.noarch.rpm"
RPM_HASH = "d4ca46018c00db041f5014f71f9809b38d215eefc10f90c820140ab099ec8e9163754049252ee99c4802c3de31dad178294b8760a51e6c470f680a42fc8e1a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvue-nbextension"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyvue"

inherit rpm
