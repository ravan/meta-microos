SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "jupyter-nbdime-jupyterlab-3.0.2-18.2.noarch.rpm"
RPM_HASH = "46bdd4158c61fd716a8580ec4ef01aaa18a955a3212013cd046caae6f577f4757e180f82448f77112339a9be3e5ba576db71ec229db1a6efee90b537940a37fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-nbdime"

inherit rpm
