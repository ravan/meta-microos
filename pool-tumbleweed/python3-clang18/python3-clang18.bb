SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "python3-clang18-18.1.8-13.1.noarch.rpm"
RPM_HASH = "50bc4175fee17dac2b9adb3113c80f63c96ff9cf3edc3912ad784c203d01c0e68f7f35413974864352a940a0a6784cf23824a58960f98609e0cea9037af4e01e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.13/site-packages/clang/ \
python3-clang18"

RDEPENDS:${PN} += "libclang13 \
python-abi \
python3-base"

inherit rpm
