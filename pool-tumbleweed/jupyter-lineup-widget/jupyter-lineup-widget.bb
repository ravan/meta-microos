SUMMARY = "Python package to export interactive HTML pages from Jupyter Notebooks"
DESCRIPTION = "NBinteract is a Python package that creates interactive webpages from Jupyter \
notebooks. NBinteract also has built-in support for interactive plotting. \
These interactions are driven by data, not callbacks, allowing authors to focus \
on the logic of their programs. \
 \
This package provides the jupyter notebook extensions."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "jupyter-lineup-widget-4.0.0-3.9.noarch.rpm"
RPM_HASH = "665ecd4e1f1eab95c4d4f38efb30a866fd1725842548c3658b3f0ba512c1a408aee2712e19d443a0c6272c735b704ed6e791124548ddda7c288bdbd95a19e692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-lineup-widget"

RDEPENDS:${PN} += "jupyter-ipywidgets \
python3dist-lineup-widget"

inherit rpm
