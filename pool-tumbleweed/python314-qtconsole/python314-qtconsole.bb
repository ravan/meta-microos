SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.7.2"

RPM_NAME = "python314-qtconsole-5.7.2-1.3.noarch.rpm"
RPM_HASH = "a52f7b22818fd1b78cb00d6c69bbaa4a6dcc7852f81397a8f57f945929f75a09bfd8289449e05c37a02994424bbfa8f4378269510e9ece6bc8c73cd602c8b0cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qtconsole \
python314-jupyter-qtconsole \
python314-qtconsole \
python3dist-qtconsole"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Pygments \
python314-QtPy \
python314-ipykernel \
python314-ipython-pygments-lexers \
python314-jupyter-client \
python314-jupyter-core \
python314-packaging \
python314-traitlets"

inherit rpm
