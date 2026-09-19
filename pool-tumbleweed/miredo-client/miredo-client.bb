SUMMARY = "Tunneling client for IPv6 over UDP through NATs"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). This offers the client \
part of miredo. Most people only need the client part."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-client-1.2.6-5.19.aarch64.rpm"
RPM_HASH = "a86a2719cc4b7efff962e942856630c5d1c17292b6da401e5448dc797c64b838fe591948994052793e3d22bf041b35232e227d7245c19403fd520fe565d19fde"

RPROVIDES:${PN} += "config-miredo-client \
miredo \
miredo-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libteredo.so.5 \
libtun6.so.0 \
miredo-common \
systemd"

inherit rpm
