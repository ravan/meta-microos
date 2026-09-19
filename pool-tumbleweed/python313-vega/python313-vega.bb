SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python313-vega-4.1.0-1.6.noarch.rpm"
RPM_HASH = "de19a8afa8a2c79040f00182cc18ab0714c9dac7a1eb6d258366b935396941fb040d676ac1116ceaa394405cebd04fb8d75e0c0adfc8a0669a8c83e178e2de1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-vega \
python3-jupyter-vega \
python3-vega \
python3.13dist-vega \
python313-jupyter-vega \
python313-vega \
python3dist-vega"

RDEPENDS:${PN} += "python-abi \
python313-ipytablewidgets \
python313-jupyter \
python313-pandas"

inherit rpm
