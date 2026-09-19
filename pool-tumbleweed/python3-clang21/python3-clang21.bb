SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "python3-clang21-21.1.8-9.2.noarch.rpm"
RPM_HASH = "30aa9d567dce7e2b4e69604408c0b174f652bc41ce030388e75aaa014222b72ebb3951266b0be6e53c45729a83cfb218aada047c1bd9086a023a11e82fc9f280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.13/site-packages/clang/ \
python3-clang21"

RDEPENDS:${PN} += "libclang13 \
python-abi"

inherit rpm
