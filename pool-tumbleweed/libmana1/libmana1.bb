SUMMARY = "MANA runtime library"
DESCRIPTION = "This package contains the mana runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libmana1-63.0-1.3.aarch64.rpm"
RPM_HASH = "76f8b79a7e8142d429247336747ab58c0f21bc71d2fbf01242c44afd51f74161c14195b040680e16b8551a4313510f86edb6320209f49464e0781f4631db8c8a"

RPROVIDES:${PN} += "libmana.so.1 \
libmana1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
