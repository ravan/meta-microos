SUMMARY = "SCTP test tool"
DESCRIPTION = "TSCTP is an SCTP test tool. Its purpose is to perform basic SCTP \
functionality tests to check implementations interoperability and \
to verify that the SCTP stack is working."
LICENSE = "BSD-3-Clause"

PV = "0.8.7"

RPM_NAME = "tsctp-0.8.7-1.1.aarch64.rpm"
RPM_HASH = "25f23f227a29abf096bd088dcf2f551a2f9063d3a9d4868c3ae99ceb6075f33a89320ea77233846e90b7d0845591f08b31fd87834f594fd9eec431657fd8ecc3"

RPROVIDES:${PN} += "tsctp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsctp.so.1"

inherit rpm
