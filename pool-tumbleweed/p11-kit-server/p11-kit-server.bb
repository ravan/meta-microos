SUMMARY = "Server and client commands for p11-kit"
DESCRIPTION = "Command line tools that enable to export PKCS#11 modules through a \
Unix domain socket.  Note that this feature is still experimental."
LICENSE = "BSD-3-Clause"

PV = "0.26.2"

RPM_NAME = "p11-kit-server-0.26.2-1.6.aarch64.rpm"
RPM_HASH = "6d49ef3737b7af563cc06b7b99d77467c431e5062e38a5218a507d0c1bede6d1c46021da14eea887e2c53fedbaa1f29f7d07b0267aad4cf1edef6d2a371c7d45"

RPROVIDES:${PN} += "p11-kit-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libp11-kit.so.0 \
p11-kit"

inherit rpm
