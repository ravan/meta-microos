SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings for LLDB. It also contains \
pretty printers for the C++ standard library."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "python3-lldb21-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "899690703dbdfb603e9893b33ebff4e12c5df9637a6dd9031cd3375ab787260bf430bfd7ef91808dda093f9c0bee3f4e732ad935dc00e0601a1b4022f0ca9f3c"

RPROVIDES:${PN} += "/usr/lib64/python3.13/site-packages/lldb/ \
python3-lldb21"

RDEPENDS:${PN} += "liblldb21 \
python-abi"

inherit rpm
