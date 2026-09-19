SUMMARY = "A collection of fast NumPy array functions"
DESCRIPTION = "Bottleneck is a collection of fast NumPy array functions written in C."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python314-Bottleneck-1.4.2-3.7.aarch64.rpm"
RPM_HASH = "26a6727b4fa6e1332ca53c3efcdc56078ab09a11b64ea606e7a61e0738fd095dd615e6aa049ca8320132646d3e2520a96e141b4c745a42affbfaecfc298ede62"

RPROVIDES:${PN} += "python3.14dist-bottleneck \
python314-Bottleneck \
python3dist-bottleneck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-numpy"

inherit rpm
