SUMMARY = "Jupyter extension providing collaboration"
DESCRIPTION = "JupyterLab/Jupyter Notebook 7+ extension providing user interface integration \
for real time collaboration. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "jupyter-collaboration-ui-2.4.0-1.2.noarch.rpm"
RPM_HASH = "9e6c8de7e0279019ae024a67c00cf7a77ad2bc9019e6c240879f497ee67e5e75bcfe691cbe5ee06449cef3a0f2db94575051f8631d0f2493a198cd65ee65fdc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-collaboration-ui"

RDEPENDS:${PN} += "python3dist-jupyter-collaboration-ui"

inherit rpm
