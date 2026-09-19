SUMMARY = "Jupyter notebook and server cofiguration for python-panel"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text. \
 \
This package contains the notebook and server extension configuration common \
to all Python flavors."
LICENSE = "BSD-3-Clause"

PV = "1.8.10"

RPM_NAME = "jupyter-panel-1.8.10-2.2.noarch.rpm"
RPM_HASH = "bec8460b428225381d7fb22e6c3853d38a65343e790d2bc791d96e836a74f44d602e13d8b95ad5a0af208a966b3cca8ba955d630654c70f5f1064687f8260758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-panel"

RDEPENDS:${PN} += "jupyter-bokeh \
python3dist-panel"

inherit rpm
