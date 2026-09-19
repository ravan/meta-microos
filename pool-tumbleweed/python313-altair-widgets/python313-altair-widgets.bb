SUMMARY = "Interactive visualization package for statistical data for Python"
DESCRIPTION = "This package provides interactive data visualization tools in the Jupyter \
Notebook. \
 \
The interactive visualization tool that is provided allows data selection \
through HTML widgets and outputs a Vega-lite plot through Altair. In the HTML \
widget it is possible to select columns to plot in various encodings. This \
widget also supports some basic configuration (i.e., log vs linear scales)."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python313-altair-widgets-0.2.2-5.6.noarch.rpm"
RPM_HASH = "56432a0238a1f4126248dfe56d8900eaf24ecfff15d30ad5f9567bb085fd489c8078e701e0d4766e8881ef6498dc767aed39f6e4e1d558b42e42ba72d6d8d819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-altair-widgets \
python3-altair-widgets \
python3-jupyter-altair-widgets \
python3.13dist-altair-widgets \
python313-altair-widgets \
python313-jupyter-altair-widgets \
python3dist-altair-widgets"

RDEPENDS:${PN} += "python-abi \
python313-altair \
python313-ipython \
python313-ipywidgets \
python313-pandas \
python313-vega"

inherit rpm
