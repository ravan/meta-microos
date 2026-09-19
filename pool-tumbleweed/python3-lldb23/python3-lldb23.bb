SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings for LLDB. It also contains \
pretty printers for the C++ standard library."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "python3-lldb23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "f624945f719344ec2b1f2b9e720b6b1e4258da5002b6ae404b461de3429c08a40377437b2e9f797bf47b0012ca0527bdb962825c46488a3ec717d94275f440bd"

RPROVIDES:${PN} += "/usr/lib64/python3.13/site-packages/lldb/ \
python3-lldb23"

RDEPENDS:${PN} += "liblldb23 \
python-abi"

inherit rpm
