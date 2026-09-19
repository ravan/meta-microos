SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python314-vega-4.1.0-1.6.noarch.rpm"
RPM_HASH = "4f07d41e04660130e83c06b6ba9528932dbb1b174f14d6c9d23a9ffea9a87818c5e0a4536532c49fcf8a2b2dc4589cdb658b6f7a58b4d86a303a862ed2f1dadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vega \
python314-jupyter-vega \
python314-vega \
python3dist-vega"

RDEPENDS:${PN} += "python-abi \
python314-ipytablewidgets \
python314-jupyter \
python314-pandas"

inherit rpm
