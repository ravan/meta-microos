SUMMARY = "Matlab kernel for Jupyter"
DESCRIPTION = "A Matlab kernel for Jupyter. The Matlab kernel is based on \
MetaKernel, which means it features a standard set of magics."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.17.1"

RPM_NAME = "jupyter-matlab-kernel-0.17.1-1.11.noarch.rpm"
RPM_HASH = "4aefd92c63169fd08908c94a4520268096e4d0079643f4e25fba50d66e5bab7264d5ce9141a2c65ac86443e3c8f2e103deee61923e95acfa138faf281e19fe77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-matlab-kernel \
python3-jupyter-matlab-kernel \
python3-matlab-kernel \
python3.13dist-matlab-kernel \
python3dist-matlab-kernel"

RDEPENDS:${PN} += "python-abi \
python3-ipython \
python3-jupyter-client \
python3-metakernel"

inherit rpm
