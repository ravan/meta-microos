SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings for LLDB. It also contains \
pretty printers for the C++ standard library."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "python3-lldb19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "b2bc188d159cf9496ac3863de15e90f4b31ecf529fb6db3d951609f22972e96c5c6bc10f9c0ec88a94dcd6336eeaf71d039c76c4ae07f2e40dc6dcc43be9e623"

RPROVIDES:${PN} += "/usr/lib64/python3.13/site-packages/lldb/ \
python3-lldb19"

RDEPENDS:${PN} += "liblldb19 \
python-abi"

inherit rpm
