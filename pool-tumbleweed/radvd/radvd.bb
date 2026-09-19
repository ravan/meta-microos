SUMMARY = "Router ADVertisement Daemon for IPv6"
DESCRIPTION = "RADVD is the Router ADVertisement Daemon. It sends IPv6 RA packets \
to advertise available IPv6 networks, and is used for automated \
configuration of IPv6 clients."
LICENSE = "radvd"

PV = "2.21"

RPM_NAME = "radvd-2.21-2.2.aarch64.rpm"
RPM_HASH = "d30733ba9e96fce99442b26b90c9ed2a8e29a0ee299d75a83498ca53a68cc1621c704049e8b880043285a5f8a4348a465d1eec8a2cbc5bd39d22554e0fa7b879"

RPROVIDES:${PN} += "config-radvd \
group-radvd \
radvd \
user-radvd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
sysuser-shadow"

inherit rpm
