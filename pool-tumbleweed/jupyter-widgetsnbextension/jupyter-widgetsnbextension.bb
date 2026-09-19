SUMMARY = "Jupyter interactive widgets for Jupyter Notebook - Jupyter Files"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
It provides the Jupyter configuration files."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.15"

RPM_NAME = "jupyter-widgetsnbextension-4.0.15-1.3.noarch.rpm"
RPM_HASH = "742e47fc9fecb8a67982c3fa0d8c56c72d618a4bfe1c7460a58b885ccf11e8558d0d11e43c08dd5a98e694c9a56a7fee05a198c589cd48b3755b1358333b1800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-js-widgets \
jupyter-jupyter-jupyter-widgets-notebook-manager \
jupyter-widgetsnbextension"

RDEPENDS:${PN} += "python3dist-widgetsnbextension"

inherit rpm
