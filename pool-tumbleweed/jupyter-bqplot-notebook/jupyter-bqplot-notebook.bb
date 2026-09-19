SUMMARY = "Interactive plotting package for Jupyter Notebooke"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the jupyter notebook extension."
LICENSE = "Apache-2.0"

PV = "0.5.46"

RPM_NAME = "jupyter-bqplot-notebook-0.5.46-15.1.noarch.rpm"
RPM_HASH = "18034c6b15e22b957420273c3c2d7e624a9d9c194d6632530c07284a567efa5703368561d5977cb2562a5e41745d06dd5f5e26c676e8de072e33730907241f3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqplot \
jupyter-bqplot-notebook"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-bqplot"

inherit rpm
