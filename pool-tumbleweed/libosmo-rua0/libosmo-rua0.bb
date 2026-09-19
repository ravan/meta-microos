SUMMARY = "RANAP User Adaption signalling library"
DESCRIPTION = "Osmocom code for the RANAP User Adaption signalling."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.1"

RPM_NAME = "libosmo-rua0-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "05b3f81aaf9edf625dec41db656f0f242fa69dfb013f02cc78a5460db1845bd340bdcbfbdc2ff86ed5c34325cbc2eb808ee84bac7490579613cefe3c08bfa3d8"

RPROVIDES:${PN} += "libosmo-rua.so.0 \
libosmo-rua0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1c.so.1 \
libc.so.6 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
