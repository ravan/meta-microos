SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings for LLDB. It also contains \
pretty printers for the C++ standard library."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "python3-lldb18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "3a3091dec7807aa477ea547135f7df360cf0601661467d3245bcd35d6792a87807284c8ec7496aebc4ae3dfe87ecc161bcbe4d8b95f98729b8675a6bc2e9b26e"

RPROVIDES:${PN} += "/usr/lib64/python3.13/site-packages/lldb/ \
python3-lldb18"

RDEPENDS:${PN} += "liblldb18 \
python-abi \
python3-base \
python3-six"

inherit rpm
