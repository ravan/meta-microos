SUMMARY = "A python-keyring backend for the kernel keyring"
DESCRIPTION = "A python-keyring [1] backend that can be used to access the kernel \
keyring. In particular, this package ships \
 \
- a python-keyring [1] backend for the kernel keyring \
- a special python-keyring backend that can be used by osc \
- a high-level interface to the kernel keyring \
- a low-level module that wraps around the C keyutils library [2] \
 \
[1] https://github.com/jaraco/keyring \
[2] https://git.kernel.org/pub/scm/linux/kernel/git/dhowells/keyutils.git"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-keyring-keyutils-0.1.1-3.13.aarch64.rpm"
RPM_HASH = "d0aa118bdce044e3d6ab9ec5d8ad3d0222222ca81e3b26e30304794c5fee8afa3436802740dd16c35ebc33f1572aa1d56a3809de3b6550f3820fa77ca8a97c95"

RPROVIDES:${PN} += "python3-keyring-keyutils \
python3.13dist-keyring-keyutils \
python313-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
