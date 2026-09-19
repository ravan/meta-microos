SUMMARY = "Jupyter widgets based on vuetify UI components - labextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.11.3"

RPM_NAME = "jupyter-jupyterlab-ipyvuetify-1.11.3-1.2.noarch.rpm"
RPM_HASH = "04193e89cb2c9693baad28fdfbd6183a59b3cc0ccaed4cf03f425d38b9dfeb0f761118594b94bec750fc9b9ab6cd0e546f86a1cf68431af47074d9ca785971e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvuetify"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyvuetify"

inherit rpm
