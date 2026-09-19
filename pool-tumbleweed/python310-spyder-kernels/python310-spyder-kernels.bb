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

RPM_NAME = "python310-spyder-kernels-2.5.0-1.1.noarch.rpm"
RPM_HASH = "aa5784d48a133c5441d5d04b827de0642fd1a84304d5b60e82b9d379527c3d80de31c27579bb9ee8629bc1b3b00b670617a12c6e7a2b2157dbbb6fc755a2ca1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-spyder-kernels \
python310-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python310-ipykernel >= 6.23.2 with python310-ipykernel < 7 \
-python310-ipython >= 8.13 with python310-ipython < 9 \
-python310-jupyter-client >= 7.4.9 with python310-jupyter-client < 9 \
python-abi \
python310-cloudpickle \
python310-pyzmq \
python310-wurlitzer"

inherit rpm
