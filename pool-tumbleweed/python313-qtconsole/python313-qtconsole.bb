SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.7.2"

RPM_NAME = "python313-qtconsole-5.7.2-1.3.noarch.rpm"
RPM_HASH = "61c1a558ea5cf2ccd5b60fb7b80883ed31edd67f72778ebd1fc4b99472d0a7c375656c3e58a2a5e0e16495d2d416981faf0c5fb9e0527deb551af7ed248d2152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-qtconsole \
python3-jupyter-qtconsole \
python3-qtconsole \
python3.13dist-qtconsole \
python313-jupyter-qtconsole \
python313-qtconsole \
python3dist-qtconsole"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Pygments \
python313-QtPy \
python313-ipykernel \
python313-ipython-pygments-lexers \
python313-jupyter-client \
python313-jupyter-core \
python313-packaging \
python313-traitlets"

inherit rpm
