SUMMARY = "Shared lib for ldas-tools-al - LDAS tools abstraction toolkit"
DESCRIPTION = "This package provides the shared library for ldas-tools-al - LDAS tools abstraction toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "libldastoolsal7-2.6.7-1.9.aarch64.rpm"
RPM_HASH = "4cbe900a6c6bd22d8f9d65585117d2ca5ee94603f41a7a52dab691965bab9267c732b80a92925dfb0a001e9be8741fc13831ccb2267bc31a91ce2e2c8cccbe40"

RPROVIDES:${PN} += "libldastoolsal.so.7 \
libldastoolsal7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
