SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "python3-clang23-23.1.1-1.1.noarch.rpm"
RPM_HASH = "8b1cae8acc3f2c36c64affd1b74b3d19de28858296e111752e70d102e15407c4083a2fa5972f6e1fe42a1c957cef48e91e0088d9a7708da2d186efa2f44e489a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.13/site-packages/clang/ \
python3-clang23"

RDEPENDS:${PN} += "libclang13 \
python-abi"

inherit rpm
