SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.5.3"

RPM_NAME = "python313-jupyterlab-templates-0.5.3-2.2.noarch.rpm"
RPM_HASH = "53513c0897b54c415cad698c0a7b38a959a78284058e7751b0259dddaa322639882990d86d75ff3b49f6223b51714a0a58837717dc9f63ad3c3263311bbdaec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-jupyterlab-templates \
python3-jupyterlab-templates \
python3.13dist-jupyterlab-templates \
python313-jupyter-jupyterlab-templates \
python313-jupyterlab-templates \
python3dist-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python-abi \
python313-jupyterlab"

inherit rpm
