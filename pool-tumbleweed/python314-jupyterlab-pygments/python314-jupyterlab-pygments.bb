SUMMARY = "Pygments theme for jupyterlab"
DESCRIPTION = "This package contains a syntax coloring theme for pygments making use \
of the JupyterLab CSS variables."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python314-jupyterlab-pygments-0.3.0-4.7.noarch.rpm"
RPM_HASH = "f00c18887b71600e55fe7a1f5ae2347bc1348dd150c2304e3fb63b1aa508d2d48663f325dcfdebca411de2922d3437266ce446a31d6a7e3208cbbb0241c96465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyterlab-pygments \
python314-jupyterlab-pygments \
python3dist-jupyterlab-pygments"

RDEPENDS:${PN} += "jupyter-jupyterlab-pygments \
python-abi"

inherit rpm
