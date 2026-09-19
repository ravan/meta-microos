SUMMARY = "Jupyter extension integrating collaborative shared models"
DESCRIPTION = "JupyterLab/Jupyter Notebook 7+ extension integrating collaborative shared models. \
 \
The collaborative shared models are used for both: \
- real time collaboration, and \
- server-side execution of notebooks"
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python314-jupyter-docprovider-2.4.0-1.2.noarch.rpm"
RPM_HASH = "e7b15c2893c95a4ccf4084be6f19a44142a9062d3a9938a04e52fab0c83e49e6d504ca1e7b93ebba9edb42fdf315171647e560d8e451210eedbf9ba6a7426fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-docprovider \
python314-jupyter-docprovider \
python3dist-jupyter-docprovider"

RDEPENDS:${PN} += "jupyter-docprovider \
python-abi"

inherit rpm
