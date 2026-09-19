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

PV = "2.4.2"

RPM_NAME = "python38-spyder-kernels-2.4.2-1.1.noarch.rpm"
RPM_HASH = "e416e2fa291dce1f5877200ee1c68f486e74936cba9ba296b393a6e936a166eef5afebef0bcb093b5e11956602168b0c3a8ed10276575f67827af83cadd0d565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-spyder-kernels \
python38-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python38-ipykernel >= 6.16.1 with python38-ipykernel < 7 \
-python38-ipython >= 7.31.1 with python38-ipython < 9 \
-python38-jupyter-client >= 7.4.9 with python38-jupyter-client < 8 \
python-abi \
python38-cloudpickle \
python38-pyzmq \
python38-wurlitzer"

inherit rpm
