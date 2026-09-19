SUMMARY = "Jupyter widgets base for Vue libraries - labextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "jupyter-jupyterlab-ipyvue-1.12.0-1.3.noarch.rpm"
RPM_HASH = "90e539fde5688c59f103e48d485933849cc52d1edee9e851d1417a366a330d33fae98350596615844f33e0e9ea60ceb4e04f35556dca53d1982e690e94ed2d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvue"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyvue"

inherit rpm
