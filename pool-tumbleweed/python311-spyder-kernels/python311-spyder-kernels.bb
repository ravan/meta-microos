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

PV = "2.5.0"

RPM_NAME = "python311-spyder-kernels-2.5.0-1.1.noarch.rpm"
RPM_HASH = "7944c0d5c1a7f103e7274665004f8ec951afa44b9838af6a69d2d0eba32424c4b9b7394f6cb34ff8170c640880b29fdf886835486a333423790451486eaa42d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spyder-kernels \
python3.11dist-spyder-kernels \
python311-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python311-ipykernel >= 6.23.2 with python311-ipykernel < 7 \
-python311-ipython >= 8.13 with python311-ipython < 9 \
-python311-jupyter-client >= 7.4.9 with python311-jupyter-client < 9 \
python-abi \
python311-cloudpickle \
python311-pyzmq \
python311-wurlitzer"

inherit rpm
