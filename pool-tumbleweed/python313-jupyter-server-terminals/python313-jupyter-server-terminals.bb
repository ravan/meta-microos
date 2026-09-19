SUMMARY = "A Jupyter Server Extension Providing Terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals."
LICENSE = "BSD-3-Clause"

PV = "0.5.4"

RPM_NAME = "python313-jupyter-server-terminals-0.5.4-1.4.noarch.rpm"
RPM_HASH = "fd1c49d1e08b3d74716325c5e18ca62c7d26d24ef2d14f21c1aa3c65e4f1de6f8740bcac6f9a140854b2011374a58e9aab371947d9c38eea634f569e6fa32090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-terminals \
python3.13dist-jupyter-server-terminals \
python313-jupyter-server-terminals \
python3dist-jupyter-server-terminals"

RDEPENDS:${PN} += "jupyter-server-terminals \
python-abi \
python313-terminado"

inherit rpm
