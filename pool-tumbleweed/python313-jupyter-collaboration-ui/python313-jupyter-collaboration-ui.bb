SUMMARY = "Jupyter extension providing collaboration"
DESCRIPTION = "JupyterLab/Jupyter Notebook 7+ extension providing user interface integration \
for real time collaboration."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python313-jupyter-collaboration-ui-2.4.0-1.2.noarch.rpm"
RPM_HASH = "3dfc35bc70193e98df2035e55c4a41d96156a87d6f2e9696f0bf4737bef9c2547e4060fa2fb0fbcc3823f38bd9983b4ddd07f91270abc53e2785c2b6934e0096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-collaboration-ui \
python3.13dist-jupyter-collaboration-ui \
python313-jupyter-collaboration-ui \
python3dist-jupyter-collaboration-ui"

RDEPENDS:${PN} += "jupyter-collaboration-ui \
python-abi"

inherit rpm
