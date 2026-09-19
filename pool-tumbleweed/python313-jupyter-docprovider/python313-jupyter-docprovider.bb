SUMMARY = "Jupyter extension integrating collaborative shared models"
DESCRIPTION = "JupyterLab/Jupyter Notebook 7+ extension integrating collaborative shared models. \
 \
The collaborative shared models are used for both: \
- real time collaboration, and \
- server-side execution of notebooks"
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python313-jupyter-docprovider-2.4.0-1.2.noarch.rpm"
RPM_HASH = "1fd2a5d9d959971a8efda6513f60418d500c198321bb2792bc3400b281b9cc5164f4a5b5afb44e92b1c37bf3dbd47fd3b11345058e8ac1ea4ceadefca80b5287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-docprovider \
python3.13dist-jupyter-docprovider \
python313-jupyter-docprovider \
python3dist-jupyter-docprovider"

RDEPENDS:${PN} += "jupyter-docprovider \
python-abi"

inherit rpm
