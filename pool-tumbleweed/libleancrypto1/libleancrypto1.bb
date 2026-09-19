SUMMARY = "Cryptographic library with stack-only support and PQC-safe algorithms"
DESCRIPTION = "Leancrypto provides a general-purpose cryptographic library with PQC-safe \
algorithms. Further it only has POSIX dependencies, and allows all algorithms \
to be used on stack as well as on heap. Accelerated algorithms are transparently \
enabled if possible."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "libleancrypto1-1.8.0-3.2.aarch64.rpm"
RPM_HASH = "d67ec0391ba68586ba9e6171e72ac1f73e34c56c48736f89ef8f01088b9bf8e7e87e460139cc3435a04ed4c84cea010b3c40ffeea0debc39face1959f6db26cb"

RPROVIDES:${PN} += "libleancrypto.so.1 \
libleancrypto1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
