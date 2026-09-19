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

RPM_NAME = "python314-keyring-keyutils-0.1.1-3.13.aarch64.rpm"
RPM_HASH = "b677c1f6a16f0c37915116baf634cf7cfdf2b60e473048c6be2aaf045606047d7d9a6f465fc91480b21b8f8521273d9bfed8d28e5238e7504966e14867cebe08"

RPROVIDES:${PN} += "python3.14dist-keyring-keyutils \
python314-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
