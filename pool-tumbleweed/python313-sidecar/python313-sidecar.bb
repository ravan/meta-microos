SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python313-sidecar-0.8.1-1.3.noarch.rpm"
RPM_HASH = "b68333ffcbb388ccb7a3856427bc154937f9be19a02cffac20080694bb0423d15a52bf0ad9731b58ceed0447154453555cc88586f367858834880a491587567a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sidecar \
python3.13dist-sidecar \
python313-sidecar \
python3dist-sidecar"

RDEPENDS:${PN} += "-python313-ipywidgets >= 8 with python313-ipywidgets < 9 \
jupyter-sidecar-jupyterlab \
python-abi"

inherit rpm
