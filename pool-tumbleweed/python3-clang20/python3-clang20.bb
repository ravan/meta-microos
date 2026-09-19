SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "python3-clang20-20.1.8-8.2.noarch.rpm"
RPM_HASH = "0699ef23d7e3e0968f6f50ae63f8361920a4fe25c962fa9d4e1359e9b383a648ee6c06af4a064b7f21835f0b772ca564e522075b98fddc02cf9b51ac85792d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.13/site-packages/clang/ \
python3-clang20"

RDEPENDS:${PN} += "libclang13 \
python-abi"

inherit rpm
