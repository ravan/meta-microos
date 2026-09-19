SUMMARY = "Jupyter extension providing collaboration"
DESCRIPTION = "JupyterLab/Jupyter Notebook 7+ extension integrating collaborative shared models. \
 \
The collaborative shared models are used for both: \
- real time collaboration, and \
- server-side execution of notebooks \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "jupyter-docprovider-2.4.0-1.2.noarch.rpm"
RPM_HASH = "82914590df599507d449250480b8df3881d474982bd567ddc71602b6e12feddcfa31a91204b291e4f917b68a87b34f64a0404b0beae0c2d4629ea5dcb6aa0fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-docprovider"

RDEPENDS:${PN} += "python3dist-jupyter-docprovider"

inherit rpm
