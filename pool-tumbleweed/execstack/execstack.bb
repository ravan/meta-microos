SUMMARY = "Utility to set/clear/query executable stack bit"
DESCRIPTION = "This package is built from prelink sources but contains just the \
execstack binary. It can be used to manipulate ELF binaries to run \
with or without executable stack."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "execstack-0.5.0-5.9.aarch64.rpm"
RPM_HASH = "465fee25d4add360167590bbcff48f83a958f0a9609ccb2cd8872fd560e26a7273823edd54f38d72cc86a2d3136e21c02fd0004d32542b6fb3a5c153f2865367"

RPROVIDES:${PN} += "execstack"

RDEPENDS:${PN} += "coreutils \
findutils \
gawk \
glibc \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libselinux.so.1 \
util-linux"

inherit rpm
