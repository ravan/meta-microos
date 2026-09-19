SUMMARY = "Applications provided by leancrypto"
DESCRIPTION = "Leancrypto provides a general-purpose cryptographic library with PQC-safe \
algorithms. Further it only has POSIX dependencies, and allows all algorithms \
to be used on stack as well as on heap. Accelerated algorithms are transparently \
enabled if possible. \
 \
This subpackage holds the tools provided by the library, such as sha*sum."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "leancrypto-tools-1.8.0-3.2.aarch64.rpm"
RPM_HASH = "f0e8bf35a9e7876f9449cc167529006d678d520b0769cb95bd734f31286212f89d35063bce639d18d318009038ce748ded6f861029c9bd08630b6f9204017541"

RPROVIDES:${PN} += "leancrypto-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libleancrypto.so.1"

inherit rpm
