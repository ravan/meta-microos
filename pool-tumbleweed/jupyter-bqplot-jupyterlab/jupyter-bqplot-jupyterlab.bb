SUMMARY = "Interactive plotting package for Jupyterlab"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the jupyterlab extension."
LICENSE = "Apache-2.0"

PV = "0.5.46"

RPM_NAME = "jupyter-bqplot-jupyterlab-0.5.46-15.1.noarch.rpm"
RPM_HASH = "4caf1601434970a27f197cdea722a99c4b194b2d99cc06bbccabbe718b7a5d62fcb60151e3fbc869780ef53c29b055950084599fe72b66ecee68b61386e2acb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqplot-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-bqplot"

inherit rpm
