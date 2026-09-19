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

RPM_NAME = "python39-spyder-kernels-2.5.0-1.1.noarch.rpm"
RPM_HASH = "6df2792fbf3f4477c84545ba4dc40f61df47a90159e561415ad0fc240f8520a7bea329bcab6d6700ce3d621cfd41743587865bc64be5a745545cc2220551dfd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-spyder-kernels \
python39-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python39-ipykernel >= 6.23.2 with python39-ipykernel < 7 \
-python39-ipython >= 8.13 with python39-ipython < 9 \
-python39-jupyter-client >= 7.4.9 with python39-jupyter-client < 9 \
python-abi \
python39-cloudpickle \
python39-pyzmq \
python39-wurlitzer"

inherit rpm
