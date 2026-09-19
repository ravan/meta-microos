SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.15"

RPM_NAME = "python313-widgetsnbextension-4.0.15-1.3.noarch.rpm"
RPM_HASH = "b1b6b5114aff5656aa71502c43290171db847768a94b0b04a39da99ba50d311c25e3152af4dbfe64f8a08caa9e04266144a7410d6e82adb77fb4e6d83b8016cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-widgetsnbextension \
python3-widgetsnbextension \
python3.13dist-widgetsnbextension \
python313-jupyter-widgetsnbextension \
python313-widgetsnbextension \
python3dist-widgetsnbextension"

RDEPENDS:${PN} += "jupyter-widgetsnbextension \
python-abi"

inherit rpm
