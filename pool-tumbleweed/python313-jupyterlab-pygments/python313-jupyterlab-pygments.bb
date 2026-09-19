SUMMARY = "Pygments theme for jupyterlab"
DESCRIPTION = "This package contains a syntax coloring theme for pygments making use \
of the JupyterLab CSS variables."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python313-jupyterlab-pygments-0.3.0-4.7.noarch.rpm"
RPM_HASH = "e3ceef18b6d43dce739b2c00baa60a6fadb5ec77ab10123c63f7a0178d48e8635edd73d42caa4814653d57d1b44db5382fd06329978009e9481e5f38ddf1c2f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-pygments \
python3.13dist-jupyterlab-pygments \
python313-jupyterlab-pygments \
python3dist-jupyterlab-pygments"

RDEPENDS:${PN} += "jupyter-jupyterlab-pygments \
python-abi"

inherit rpm
