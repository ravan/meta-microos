SUMMARY = "Linux network configuration utilities"
DESCRIPTION = "iproute2 is a collection of user-space utilities to set up networking \
under Linux from the command-line. It can inspect and configure, \
among other things: interface paramters, IP addresses, routing, \
tunnels, bridges, packet transformations (IPsec, etc.), and Quality \
of Service."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "iproute2-7.2-1.1.aarch64.rpm"
RPM_HASH = "14640f558e07f2dd573c490f8590c6988b3333ded69b928ad0bf1a72d7af73828967ab70c522bcfcf266873d38e730ffc2f772f444d870e985eb85b7990501ce"

RPROVIDES:${PN} += "/sbin/ip \
iproute \
iproute2 \
iproute2-bash-completion \
iproute2-doc \
iproute2-xfrm6-raw"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libelf.so.1 \
libm.so.6 \
libmnl.so.0 \
libselinux.so.1 \
libxtables.so.12"

inherit rpm
