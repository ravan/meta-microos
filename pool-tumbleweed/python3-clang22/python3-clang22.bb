SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "python3-clang22-22.1.8-3.2.noarch.rpm"
RPM_HASH = "712b9832eee7f37a68ce628f6afaef6c5c9b380645cd69216ea8586726c9a6ba7d39276b24d3c54324658521db6f6c4e5bbde9264c90c5ee3a1d91f1f2dbd175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib/python3.13/site-packages/clang/ \
python3-clang22"

RDEPENDS:${PN} += "libclang13 \
python-abi"

inherit rpm
