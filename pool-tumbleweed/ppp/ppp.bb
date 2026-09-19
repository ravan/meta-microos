SUMMARY = "The Point to Point Protocol for Linux"
DESCRIPTION = "The ppp package contains the PPP (Point-to-Point Protocol) daemon, \
pppd, additional PPP utilities, documentation, and sample files. PPP \
provides a method for transmitting IP and IPX datagrams over serial \
point-to-point links, for example over a modem. The PPP daemon handles \
the details of setting up a PPP link including configuring the network \
interface and performing the PPP negotiations."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.5.2"

RPM_NAME = "ppp-2.5.2-3.4.aarch64.rpm"
RPM_HASH = "258f2aefe453eba4ee69547cc56bb615eb71cd41393ce63e12e19a1b1c2b723edda134a6d18e67d812cfd0183c25f6d74cb4419a04a024965000ee56324b15d2"

RPROVIDES:${PN} += "config-ppp \
ppp"

RDEPENDS:${PN} += "/usr/bin/sh \
group-dialout \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libpam.so.0 \
libpcap.so.1 \
libssl.so.3 \
libsystemd.so.0"

inherit rpm
