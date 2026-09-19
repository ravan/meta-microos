SUMMARY = "Implementation of the IETF QUIC protocol"
DESCRIPTION = "ngtcp2 is an implementation of the QUIC protocol (RFC 9000) \
with a C library API."
LICENSE = "MIT"

PV = "1.25.0"

RPM_NAME = "libngtcp2-16-1.25.0-2.1.aarch64.rpm"
RPM_HASH = "7271216ef15f73178361f7597d5d425ec2c7e5d798d5feaf4be919d576b3c94bb417b01623087fbacd63e27bec35ffaafd98b4ece65da4b93ece87878be4d9fe"

RPROVIDES:${PN} += "libngtcp2-16 \
libngtcp2.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
