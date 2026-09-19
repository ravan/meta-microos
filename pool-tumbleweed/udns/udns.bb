SUMMARY = "DNS resolver tools"
DESCRIPTION = "UDNS is a stub DNS resolver library with ability to perform both \
synchronous and asynchronous DNS queries."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6"

RPM_NAME = "udns-0.6-1.9.aarch64.rpm"
RPM_HASH = "72941669355bda0aa0062d24594a45789c936680b60d3c14645fb4b0c156ca31d9eb9f8a463c254394a4a918707c1d61c3945594974f91add1f1ddaea574d2dc"

RPROVIDES:${PN} += "udns"

RDEPENDS:${PN} += "libc.so.6 \
libudns.so.0"

inherit rpm
