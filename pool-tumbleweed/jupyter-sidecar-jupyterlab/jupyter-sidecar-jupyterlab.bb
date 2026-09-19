SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "jupyter-sidecar-jupyterlab-0.8.1-1.3.noarch.rpm"
RPM_HASH = "580cc1b9489902cf6d9233547d7d25f786684f251a01c48a4f56ca197ee9134ab259b3213c4180e544f1da9c4054b71fa632f4b6fe0f0b39670f3523408a77f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-sidecar-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-sidecar"

inherit rpm
