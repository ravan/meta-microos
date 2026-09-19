SUMMARY = "Matplotlib JupyterLab Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "jupyter-matplotlib-jupyterlab-0.11.7-18.1.noarch.rpm"
RPM_HASH = "e58f0f7b400d24e2329fefd3c8cc2b2574b4d5bb5dffbd122cfb5a319f362a5dddd34929229e027cddc717471c009a5dbe33ab93d229b48a5687076484d0cf7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl-jupyterlab \
jupyter-matplotlib-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipympl"

inherit rpm
