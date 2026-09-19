SUMMARY = "Compact C Type Format library (runtime, no BFD dependency)"
DESCRIPTION = "This package includes the libctf-nobfd shared library. \
The Compact C Type Format (CTF) is a way of representing information about a binary program"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "libctf-nobfd0-2.45-4.3.aarch64.rpm"
RPM_HASH = "208b93dd498def427cd7a0e3a924b90a30bc96a9dbf9f0bdcdb0a80ab9ec388111257417fcbce707a359ce558c82f5e05664e91677b61b7401b83d634d88265f"

RPROVIDES:${PN} += "libctf-nobfd.so.0 \
libctf-nobfd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
