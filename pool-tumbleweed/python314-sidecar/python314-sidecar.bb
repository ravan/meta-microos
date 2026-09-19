SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python314-sidecar-0.8.1-1.3.noarch.rpm"
RPM_HASH = "c4f86186a3ce786716bb07342447e83fcfeb5152a25f65916c21badd6be6cdec70047beab746b09e415b918fa88e12a46ac72aecfb44c1def448b00a14c61270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sidecar \
python314-sidecar \
python3dist-sidecar"

RDEPENDS:${PN} += "-python314-ipywidgets >= 8 with python314-ipywidgets < 9 \
jupyter-sidecar-jupyterlab \
python-abi"

inherit rpm
