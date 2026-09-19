SUMMARY = "The FRRouting Protocol Suite"
DESCRIPTION = "FRR is free software that implements and manages various IPv4 and IPv6 routing protocols. \
FRR currently supports the following protocols: \
- BGP \
- OSPFv2 \
- OSPFv3 \
- RIPv1 \
- RIPv2 \
- RIPng \
- IS-IS \
- PIM-SM/MSDP \
- LDP \
- BFD \
- Babel \
- PBR \
- OpenFabric \
- VRRP \
- EIGRP (alpha) \
- NHRP (alpha)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "frr-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "97d6513427a4c2ad5b22bcbb1a44c2deaacb0bc63fbdb3ab9d674d3130aa1c35e3c073ebdbf1a904e124c73c719ee081d36cc9b204947086a21ac2ae2e4240d7"

RPROVIDES:${PN} += "config-frr \
frr \
group-frr \
group-frrvty \
user-frr \
zebra"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
grep \
libc.so.6 \
libcrypto.so.3 \
libfrr-pb.so.0 \
libfrr.so.0 \
libfrrcares.so.0 \
libfrrfpm-pb.so.0 \
libjson-c.so.5 \
libm.so.6 \
libmgmt-be-nb.so.0 \
libmlag-pb.so.0 \
libpam-misc.so.0 \
libpam.so.0 \
libpcre2-posix.so.3 \
libprotobuf-c.so.1 \
libreadline.so.8 \
librtr.so.0 \
libyang.so.3 \
lsof \
sysuser-shadow \
util-linux"

inherit rpm
