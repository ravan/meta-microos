SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings for LLDB. It also contains \
pretty printers for the C++ standard library."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "python3-lldb20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "9496acce34ccc2f470f0a7d16c1690c441937bbf72f41e2d99202f077aba6d78d5eca992d1d989d27a568f7117b7447161480384bff6674cdbad5f0ff02b0ea3"

RPROVIDES:${PN} += "/usr/lib64/python3.13/site-packages/lldb/ \
python3-lldb20"

RDEPENDS:${PN} += "liblldb20 \
python-abi"

inherit rpm
