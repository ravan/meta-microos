SUMMARY = "Wireless setup and cryptography library"
DESCRIPTION = "The 'Embedded Linux Library' implements an API for wireless \
cryptography actions by using the kernel crypto API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.83"

RPM_NAME = "libell0-0.83-1.3.aarch64.rpm"
RPM_HASH = "c97a215105c68c6d3a27bca2763f83b8ef368070f0d70d9c0888d4ce300fa9c88db4586f2736d06adba29ff62fb7d2e2b50407cce5aa1eeb4a0212ed3632086c"

RPROVIDES:${PN} += "libell.so.0 \
libell0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
