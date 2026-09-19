SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings for LLDB. It also contains \
pretty printers for the C++ standard library."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "python3-lldb22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "dd801382651b048739c5eb0ac966e02851797ce2df2d89bbfd201de4713325c95799e08df503ad35a39f5f6b1896057c3859c7d4d28fbbfedc9e39f7e7645a31"

RPROVIDES:${PN} += "/usr/lib64/python3.13/site-packages/lldb/ \
python3-lldb22"

RDEPENDS:${PN} += "liblldb22 \
python-abi"

inherit rpm
