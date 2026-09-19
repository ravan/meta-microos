SUMMARY = "Radio Access Network Application Part library"
DESCRIPTION = "Osmocom code for the Radio Access Network Application Part of the Iu-h \
interface."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.1"

RPM_NAME = "libosmo-ranap7-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "16780d898771a339ef5060662ed402b05bb7d51ce8fdda967fae7bf432e8b50a4f507e6c6f0c53cf57066d0a8c6a229ef6242a8c378e9be1c892a13bdfa9ca18"

RPROVIDES:${PN} += "libosmo-ranap.so.7 \
libosmo-ranap7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1c.so.1 \
libc.so.6 \
libosmo-sigtran.so.12 \
libosmocore.so.22 \
libosmogsm.so.20 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
