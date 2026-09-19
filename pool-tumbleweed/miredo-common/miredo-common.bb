SUMMARY = "Runtime libraries for miredo"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). It can serve \
either as a Teredo client, a stand-alone Teredo relay, or a Teredo \
server, please install the miredo-server or miredo-client appropriately. \
It is meant to provide IPv6 connectivity to hosts behind NAT \
devices, most of which do not support IPv6, and not even \
IPv6-over-IPv4 (including 6to4). \
This common package provides the files necessary for both server and client."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-common-1.2.6-5.19.aarch64.rpm"
RPM_HASH = "0b8af2a1e1550422484517ad64474e5ed9d67dbd3586023afb08721f3e3c240178b5e11dde7cdcf2b6331200b92e9702cdc6c638dbf57338eecd6630949bd87b"

RPROVIDES:${PN} += "miredo-common \
miredo-libs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libteredo.so.5 \
shadow"

inherit rpm
