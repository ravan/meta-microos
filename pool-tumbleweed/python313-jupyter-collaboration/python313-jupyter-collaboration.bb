SUMMARY = "Jupyter Server Extension Providing Support for Y Documents"
DESCRIPTION = "Jupyter Collaboration is a Jupyter server extension providing Support for Y Documents. \
 \
This is a meta-package for: \
- jupyter-collaboration-ui \
- jupyter-docprovider \
- jupyter-server-ydoc"
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "python313-jupyter-collaboration-4.4.0-1.2.noarch.rpm"
RPM_HASH = "39d69b1cbd0457216fc0c5b7ac5e48ef5661c76e07f3ac295f5fb6fb428d71a5797cbc179ffaaa8cf40c1281a444afa13eb90ee878f5e7e5009026b47bd6a5e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-collaboration \
python3.13dist-jupyter-collaboration \
python313-jupyter-collaboration \
python3dist-jupyter-collaboration"

RDEPENDS:${PN} += "-python313-jupyter-collaboration-ui >= 2.4.0 with python313-jupyter-collaboration-ui < 3 \
-python313-jupyter-docprovider >= 2.4.0 with python313-jupyter-docprovider < 3 \
-python313-jupyter-server-ydoc >= 2.4.0 with python313-jupyter-server-ydoc < 3 \
-python313-jupyterlab >= 4.4.0 with python313-jupyterlab < 5 \
python-abi"

inherit rpm
