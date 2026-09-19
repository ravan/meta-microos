SUMMARY = "Jupyter configuration for python-dash"
DESCRIPTION = " \
Dash is a Python framework for building analytical web applications. \
 \
This package provides the jupyter notebook and jupyterlab configuration \
for python-dash"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "jupyter-dash-4.1.0-1.2.noarch.rpm"
RPM_HASH = "a26104f5b6c6e05132b59f92e796d01b2cd4b93aac52add48945573265a04bb64292506d12bb13c0a72ceb6bb253d8820cf072623cddb459681f912ea408bea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-dash"

RDEPENDS:${PN} += "python3dist-dash"

inherit rpm
