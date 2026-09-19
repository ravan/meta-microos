SUMMARY = "An authoritative-only domain name server"
DESCRIPTION = "NSD is a complete implementation of an authoritative domain name server, developed \
by NLnet Labs, with the purpose of creating more diversity in the DNS landscape."
LICENSE = "BSD-3-Clause"

PV = "4.14.3"

RPM_NAME = "nsd-4.14.3-1.1.aarch64.rpm"
RPM_HASH = "d9a439150d94bd1317aca9701bce5fdfc7f7660eb017792011d9c4183de9bec8e905b7e69c8c763fb81ee969be010768314d9137243c6bc8469f0c466dcc6916"

RPROVIDES:${PN} += "config-nsd \
group--nsd \
nsd \
user--nsd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
findutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libfstrm.so.0 \
libprotobuf-c.so.1 \
libssl.so.3 \
libsystemd.so.0 \
openssl \
shadow"

inherit rpm
