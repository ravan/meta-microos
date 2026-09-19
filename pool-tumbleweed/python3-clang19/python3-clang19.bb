SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "python3-clang19-19.1.7-14.3.noarch.rpm"
RPM_HASH = "9685723a04ac710ed94c0a7e694295907453009e9f51bce1c2dbc2f0f62376b8d864f73f43292dca9e9efb625ee100c1628ba5aeb28bab56483ad50b0fc71781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.13/site-packages/clang/ \
python3-clang19"

RDEPENDS:${PN} += "libclang13 \
python-abi"

inherit rpm
