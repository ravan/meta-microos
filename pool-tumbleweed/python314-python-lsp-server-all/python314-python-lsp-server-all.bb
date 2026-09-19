SUMMARY = "The python-lsp-server[all] extra"
DESCRIPTION = "Python Language Server for the Language Server Protocol \
 \
This package provides the dependencies for the pip \
python-lsp-server[all] extra requirement"
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python314-python-lsp-server-all-1.14.0-3.2.noarch.rpm"
RPM_HASH = "8f73b0ce0fe52bb285272ef4e1e7a1b4769c5bc6a359eb974f0af688b8de36884c163f925d55a482c8c1e494de45a5766da0a7e3461586d1f9e5b0a07f18d279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-python-lsp-server-all"

RDEPENDS:${PN} += "-python314-flake8 >= 7.2 with python314-flake8 < 8 \
-python314-mccabe >= 0.7.0 with python314-mccabe < 0.8.0 \
-python314-pycodestyle >= 2.14.0 with python314-pycodestyle < 2.15.0 \
-python314-pydocstyle >= 6.3.0 with python314-pydocstyle < 6.4.0 \
-python314-pyflakes >= 3.3.0 with python314-pyflakes < 3.5.0 \
-python314-pylint >= 3.1 with python314-pylint < 4.1 \
-python314-whatthepatch >= 1.0.2 with python314-whatthepatch < 2 \
python314-autopep8 \
python314-python-lsp-server \
python314-rope \
python314-yapf"

inherit rpm
