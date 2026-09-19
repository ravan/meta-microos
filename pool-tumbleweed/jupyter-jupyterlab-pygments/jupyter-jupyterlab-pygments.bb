SUMMARY = "Pygments theme for jupyterlab -- Jupyterlab extension files"
DESCRIPTION = "This package contains the Jupyterlab extension files for python-jupyterlab-pygments"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "jupyter-jupyterlab-pygments-0.3.0-4.7.noarch.rpm"
RPM_HASH = "65d402fe35025749e17c3bdb0440bc0cfc3c7b7e5dbdeabfe27d2c10c046a8a626a28fbd1dbc35373a32630318495ee5ccd586622103963aaae6be344742ccc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-pygments"

RDEPENDS:${PN} += "python3dist-jupyterlab-pygments"

inherit rpm
