SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.5.3"

RPM_NAME = "jupyter-jupyterlab-templates-0.5.3-2.2.noarch.rpm"
RPM_HASH = "5700883d26142b0bd8a2ecdef4e5a87ca6273d624f7064419979629f639a833c8a100f16ab8c942042ae955bbfc4c677789155e4567e528acb4e9899f8a526da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-jupyterlab-templates"

inherit rpm
