SUMMARY = "Jupyter kernels for Spyder's console"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package provides Jupyter kernels for use with the consoles \
of Spyder. These can launched either through Spyder itself or \
in an independent Python session, and allow for interactive or \
file-based execution of Python code in different environments, \
all inside the IDE."
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python313-spyder-kernels-3.1.4-2.2.noarch.rpm"
RPM_HASH = "e853e3fab55c620af88f70a3db97a36b3355e0007e5711094becb2eb5ac3f84d803e4e163dafdee2e35e6aee3f594355f6ad3cd7d05e9d201552634bd1baf53f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spyder-kernels \
python3.13dist-spyder-kernels \
python313-spyder-kernels \
python3dist-spyder-kernels \
spyder-dicom \
spyder-hdf5"

RDEPENDS:${PN} += "-python313-ipykernel >= 6.29.3 with python313-ipykernel < 7 \
-python313-ipython >= 8.15 with python313-ipython < 10 \
-python313-jupyter-client >= 7.4.9 with python313-jupyter-client < 9 \
python-abi \
python313-cloudpickle \
python313-packaging \
python313-pyxdg \
python313-pyzmq \
python313-traitlets \
python313-wurlitzer"

inherit rpm
