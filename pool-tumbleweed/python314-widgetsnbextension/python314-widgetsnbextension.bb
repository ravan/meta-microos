SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.15"

RPM_NAME = "python314-widgetsnbextension-4.0.15-1.3.noarch.rpm"
RPM_HASH = "18f42f936dac6017a7dfe00c15133954743eb8a5d8dd701b440de54725f3c95b8ddd16813369d68f14d2140d482f317161cbc57fcd0e94a48772378aab58a3bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-widgetsnbextension \
python314-jupyter-widgetsnbextension \
python314-widgetsnbextension \
python3dist-widgetsnbextension"

RDEPENDS:${PN} += "jupyter-widgetsnbextension \
python-abi"

inherit rpm
