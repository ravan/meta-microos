SUMMARY = "Jupyterlab extension for python-ipytablewidgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
This package provides the jupyterlab extension"
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "jupyter-ipytablewidgets-jupyterlab-0.3.4-1.1.noarch.rpm"
RPM_HASH = "356590ea7fe910a619aa12795cf36fe6089424f86526aa12f27ef015e24fdeb7524ef13c7ee7577fa0cb93571fb2e31e2b82a5f3fc37adac4b541af449647232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipytablewidgets-jupyterlab"

RDEPENDS:${PN} += "python3dist-ipytablewidgets"

inherit rpm
