SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "7.5.6"

RPM_NAME = "python313-notebook-7.5.6-1.2.noarch.rpm"
RPM_HASH = "9025a3d190089267f51e9d3934365644be4dbc63c6791dc4e9361175c7a323ec050784a6378e9414c328f8cb2e98aaa3525e6813dac0e5ee84ef06bd52587b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-notebook \
python3-notebook \
python3.13dist-notebook \
python313-jupyter-notebook \
python313-notebook \
python3dist-notebook"

RDEPENDS:${PN} += "-python313-jupyter-server >= 2.4 with python313-jupyter-server < 3 \
-python313-jupyterlab >= 4.5.1 with python313-jupyterlab < 4.6 \
-python313-jupyterlab-server >= 2.28 with python313-jupyterlab-server < 3 \
-python313-notebook-shim >= 0.2 with python313-notebook-shim < 0.3 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
jupyter-notebook \
python-abi \
python313-tornado"

inherit rpm
