SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.31.0"

RPM_NAME = "python313-ipykernel-6.31.0-3.2.noarch.rpm"
RPM_HASH = "40ca60ac99a6d35e0509e08c07b06730a95ce405e1521bd69278e41c592ea48c7e30314c883281f5eece744863cf60a133d8e975e70632610128ff7e86879beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipykernel \
python3-ipykernel \
python3-jupyter-ipykernel \
python3.13dist-ipykernel \
python313-ipykernel \
python313-ipykernel-doc \
python313-jupyter-ipykernel \
python313-jupyter-ipykernel-doc \
python314-ipykernel-doc \
python314-jupyter-ipykernel-doc \
python3dist-ipykernel"

RDEPENDS:${PN} += "jupyter-jupyter-client \
python-abi \
python313-comm \
python313-debugpy \
python313-ipython \
python313-jupyter-client \
python313-matplotlib-inline \
python313-nest-asyncio \
python313-packaging \
python313-psutil \
python313-pyzmq \
python313-tornado \
python313-traitlets"

inherit rpm
