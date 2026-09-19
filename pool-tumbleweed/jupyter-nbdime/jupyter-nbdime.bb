SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the tools and jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "7.0.2"

RPM_NAME = "jupyter-nbdime-7.0.2-18.2.noarch.rpm"
RPM_HASH = "037a3316d86f2735f472de708efe3fe3f176d138c97cc8116e5e823ffc41838b24eda2b87b621c44e5df6f18fd0b84a4c781b9d675a9bb0131649f31cb68acb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime"

RDEPENDS:${PN} += "python3dist-nbdime"

inherit rpm
