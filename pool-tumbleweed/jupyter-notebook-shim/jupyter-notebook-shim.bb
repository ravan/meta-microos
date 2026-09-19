SUMMARY = "The configuration file for python-notebook-shim"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend. Common configuration \
file"
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "jupyter-notebook-shim-0.2.4-1.9.noarch.rpm"
RPM_HASH = "c77f58634bdc0f2362cba65389140e84aecd0571cf1c4f52c3385824767c139f1483fc427c1c08c6a95c57e40ebcd44cdbb7501e12a59e119369115cf6ae77fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-shim \
juypter-notebook-shim"

RDEPENDS:${PN} += "python3dist-notebook-shim"

inherit rpm
