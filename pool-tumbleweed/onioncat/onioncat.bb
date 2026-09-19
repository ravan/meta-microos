SUMMARY = "VPN adapter for Tor and I2P"
DESCRIPTION = "OnionCat creates a transparent IP layer on top of Tor's hidden services. It \
transmits any kind of IP-based data transparently through the Tor network on a \
location hidden basis. You can think of it as a point-to-multipoint VPN between \
hidden services."
LICENSE = "GPL-3.0-only"

PV = "4.11.0"

RPM_NAME = "onioncat-4.11.0-1.14.aarch64.rpm"
RPM_HASH = "f24b07c65ce028e4d035724ac5ef06eafa0793b063770da423845c4e0a8a3248efd38a1597c7b735ce0c9daef49ffad1776cb750cf4ce30440092649e7f02ef8"

RPROVIDES:${PN} += "onioncat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
tor"

inherit rpm
