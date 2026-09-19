SUMMARY = "Jupyter Server Extension Providing Support for Y Documents"
DESCRIPTION = "Jupyter Collaboration is a Jupyter server extension providing Support for Y Documents. \
 \
This is a meta-package for: \
- jupyter-collaboration-ui \
- jupyter-docprovider \
- jupyter-server-ydoc"
LICENSE = "BSD-3-Clause"

PV = "4.2.1"

RPM_NAME = "python311-jupyter-collaboration-4.2.1-1.1.noarch.rpm"
RPM_HASH = "29b0c01db6578dc2212a40fa1db1a6b1618152246602721585dbb0ea6a397c6d36c5e11b063cd0d24f42cc7b9454e8bc017477b459eeeb5935e9ebfd194bd30e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyter-collaboration \
python311-jupyter-collaboration \
python3dist-jupyter-collaboration"

RDEPENDS:${PN} += "-python311-jupyter-collaboration-ui >= 2.2.1 with python311-jupyter-collaboration-ui < 3 \
-python311-jupyter-docprovider >= 2.2.1 with python311-jupyter-docprovider < 3 \
-python311-jupyter-server-ydoc >= 2.2.1 with python311-jupyter-server-ydoc < 3 \
-python311-jupyterlab >= 4.4.0 with python311-jupyterlab < 5 \
python-abi"

inherit rpm
