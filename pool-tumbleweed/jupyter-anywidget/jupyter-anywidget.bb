SUMMARY = "Custom jupyter widgets made easy"
DESCRIPTION = "- create widgets **without complicated cookiecutter templates** \
- **publish to PyPI** like any other Python package \
- prototype **within** `.ipynb` or `.py` files \
- run in **Jupyter**, **JupyterLab**, **Google Colab**, **VSCode**, and more \
- develop with **instant HMR**, like modern web frameworks \
 \
This package provides the jupyter notebook extensions."
LICENSE = "MIT"

PV = "0.9.21"

RPM_NAME = "jupyter-anywidget-0.9.21-1.4.noarch.rpm"
RPM_HASH = "2c1eeb6cf4feb1a183d0504bd567d3ffa7585fa81dc03f688ba143d7b36af6526e9288fba60cb04732e2f59f1aadcb3605980d7d32a44237ac7d180e233e4ba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-anywidget"

RDEPENDS:${PN} += "jupyter-ipywidgets \
python3dist-anywidget"

inherit rpm
