SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "7.5.6"

RPM_NAME = "python314-notebook-7.5.6-1.2.noarch.rpm"
RPM_HASH = "a97628f6ff18ff97da727cdc8182a91ef09a65ef98747869cf7594515ce14965fcc73b65cb16ec598129bc39880b510102a6e7cb8b35927cce926e3a0c8c7410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-notebook \
python314-jupyter-notebook \
python314-notebook \
python3dist-notebook"

RDEPENDS:${PN} += "-python314-jupyter-server >= 2.4 with python314-jupyter-server < 3 \
-python314-jupyterlab >= 4.5.1 with python314-jupyterlab < 4.6 \
-python314-jupyterlab-server >= 2.28 with python314-jupyterlab-server < 3 \
-python314-notebook-shim >= 0.2 with python314-notebook-shim < 0.3 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
jupyter-notebook \
python-abi \
python314-tornado"

inherit rpm
