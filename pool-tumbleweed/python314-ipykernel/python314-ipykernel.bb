SUMMARY = "IPython Kernel for Jupyter"
DESCRIPTION = "This package provides the IPython kernel for Jupyter."
LICENSE = "BSD-3-Clause"

PV = "6.31.0"

RPM_NAME = "python314-ipykernel-6.31.0-3.2.noarch.rpm"
RPM_HASH = "575a5fa4f8f03018e20a369976b812b1f61f7b47b54d56ef05e0cff2c6fd5b4ea5bfc910678152318a29d221d2208c5d13a1aac0b364efe75879a3f611cd4e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipykernel \
python313-ipykernel-doc \
python313-jupyter-ipykernel-doc \
python314-ipykernel \
python314-ipykernel-doc \
python314-jupyter-ipykernel \
python314-jupyter-ipykernel-doc \
python3dist-ipykernel"

RDEPENDS:${PN} += "jupyter-jupyter-client \
python-abi \
python314-comm \
python314-debugpy \
python314-ipython \
python314-jupyter-client \
python314-matplotlib-inline \
python314-nest-asyncio \
python314-packaging \
python314-psutil \
python314-pyzmq \
python314-tornado \
python314-traitlets"

inherit rpm
