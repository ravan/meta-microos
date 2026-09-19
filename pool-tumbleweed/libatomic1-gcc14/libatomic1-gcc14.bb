SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "14.4.0+git12698"

RPM_NAME = "libatomic1-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "90d4fbbb17fac1fe03b13f1df8e84af679e4094e6de326ea93fb4e4fb3e6290b0ec78c0825f393d2ba4d170f6488ae32a9b2f8c02bef83964cc3ee236f7c98c9"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1 \
libatomic1-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
