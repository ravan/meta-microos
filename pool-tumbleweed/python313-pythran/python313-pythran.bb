SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python313-pythran-0.19.0-1.1.noarch.rpm"
RPM_HASH = "a61167240d71efc4a7d074cfdb27176da084b04dd2d704f6170cd604b27938b4faf4d058081afd61a7bf2c3cae5fcc49a4125d2572e25a92ca2ec00d4cba2a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythran \
python3.13dist-pythran \
python313-pythran \
python3dist-pythran"

RDEPENDS:${PN} += "-python313-beniget >= 0.5.0 with python313-beniget < 0.6.0 \
-python313-gast >= 0.7.0 with python313-gast < 0.8.0 \
/usr/bin/python3.13 \
/usr/bin/sh \
boost-devel \
gcc-c++ \
python-abi \
python313-devel \
python313-numpy \
python313-numpy-devel \
python313-ply \
python313-setuptools \
update-alternatives \
xsimd-devel"

inherit rpm
