SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "9.2.0"

RPM_NAME = "jupyter-ipyparallel-9.2.0-1.1.noarch.rpm"
RPM_HASH = "8016293764385952ce0d303c532d2753e7b7a824275929bc6091ad1313315ddcf59ee768f6f0cfd0be3dee5aa8861293c2cf93e421fd5536688a578b674f6145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyparallel \
jupyter-ipyparallel-l \
jupyter-ipyparallel-nbext \
jupyter-ipyparallel-serverextension"

RDEPENDS:${PN} += "jupyter-jupyter-core \
jupyter-jupyter-server \
jupyter-jupyterlab \
jupyter-notebook \
python3dist-ipyparallel"

inherit rpm
