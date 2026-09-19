SUMMARY = "The python-lsp-server[all] extra"
DESCRIPTION = "Python Language Server for the Language Server Protocol \
 \
This package provides the dependencies for the pip \
python-lsp-server[all] extra requirement"
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python313-python-lsp-server-all-1.14.0-3.2.noarch.rpm"
RPM_HASH = "c54038ff832ad2938f6a05b3422037ff389e0e8267456baf3e9fc62f1eb8ab92c2c722ae562d5770625ebaf88c839c82f7d31410a0ceb42923ffa8950affc215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-server-all \
python313-python-lsp-server-all"

RDEPENDS:${PN} += "-python313-flake8 >= 7.2 with python313-flake8 < 8 \
-python313-mccabe >= 0.7.0 with python313-mccabe < 0.8.0 \
-python313-pycodestyle >= 2.14.0 with python313-pycodestyle < 2.15.0 \
-python313-pydocstyle >= 6.3.0 with python313-pydocstyle < 6.4.0 \
-python313-pyflakes >= 3.3.0 with python313-pyflakes < 3.5.0 \
-python313-pylint >= 3.1 with python313-pylint < 4.1 \
-python313-whatthepatch >= 1.0.2 with python313-whatthepatch < 2 \
python313-autopep8 \
python313-python-lsp-server \
python313-rope \
python313-yapf"

inherit rpm
