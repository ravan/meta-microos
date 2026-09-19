SUMMARY = "Jupyter Server Extension Providing Support for Y Documents"
DESCRIPTION = "Jupyter Collaboration is a Jupyter server extension providing Support for Y Documents. \
 \
This is a meta-package for: \
- jupyter-collaboration-ui \
- jupyter-docprovider \
- jupyter-server-ydoc"
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "python314-jupyter-collaboration-4.4.0-1.2.noarch.rpm"
RPM_HASH = "37765d6863b9f9fed802bdade8bf0c6e6a1265fee8bf28d0bace8ebe300c98019dbcd76a922a10a166327b711256efcd4a191c83354ebeda74e66e1b133b9ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-collaboration \
python314-jupyter-collaboration \
python3dist-jupyter-collaboration"

RDEPENDS:${PN} += "-python314-jupyter-collaboration-ui >= 2.4.0 with python314-jupyter-collaboration-ui < 3 \
-python314-jupyter-docprovider >= 2.4.0 with python314-jupyter-docprovider < 3 \
-python314-jupyter-server-ydoc >= 2.4.0 with python314-jupyter-server-ydoc < 3 \
-python314-jupyterlab >= 4.4.0 with python314-jupyterlab < 5 \
python-abi"

inherit rpm
