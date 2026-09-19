SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libatomic1-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "237ae15dc0800598cfd5bc4cd85b6bce3f47315f91e95e08f7c5fb66248fbd76fe5576b3e7e4183ba3dae026645282c0ebfd12ac877c86ab8857096fe653c4c2"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1 \
libatomic1-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
