SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "7.5.6"

RPM_NAME = "jupyter-notebook-7.5.6-1.2.noarch.rpm"
RPM_HASH = "9b59927bcc2bd433c76990d44245af83da90552a5eac7b4f6c1b71184c769675b1e0d2913c3f7b7bed08e5d0006dd71fa4330ef22a02ed4dbdb7f7e04c4af8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook \
jupyter-notebook-doc"

RDEPENDS:${PN} += "python3dist-notebook"

inherit rpm
