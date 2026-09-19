SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python314-pythran-0.19.0-1.1.noarch.rpm"
RPM_HASH = "f89eab55d4a54194d36d785152018886ca66889c972fa87d12ebad5bc9d8bef1516ecccf737b1b7b6ac55b3a408d6cbed37763d0525f0ddf9c7db0496565d911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pythran \
python314-pythran \
python3dist-pythran"

RDEPENDS:${PN} += "-python314-beniget >= 0.5.0 with python314-beniget < 0.6.0 \
-python314-gast >= 0.7.0 with python314-gast < 0.8.0 \
/usr/bin/python3.14 \
/usr/bin/sh \
boost-devel \
gcc-c++ \
python-abi \
python314-devel \
python314-numpy \
python314-numpy-devel \
python314-ply \
python314-setuptools \
update-alternatives \
xsimd-devel"

inherit rpm
