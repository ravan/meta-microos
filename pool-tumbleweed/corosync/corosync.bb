SUMMARY = "The Corosync Cluster Engine and Application Programming Interfaces"
DESCRIPTION = "This package contains the Corosync Cluster Engine Executive, several default \
APIs and libraries, default configuration files, and an init script."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "corosync-3.1.10-5.1.aarch64.rpm"
RPM_HASH = "24199428c14172f548071a799f7e6f5e1d0cb9be571b49636886949683ba660ec4c3dc6c6480d1ab8156fab115f9fd2e5374b4767cae57a53d8a446b1bc8ec67"

RPROVIDES:${PN} += "corosync"

RDEPENDS:${PN} += "/usr/bin/sh \
corosync-libs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfg.so.7 \
libcmap.so.4 \
libcorosync-common.so.4 \
libcpg.so.4 \
libknet.so.1 \
libknet1 \
libknet1-crypto-nss-plugin \
libqb.so.100 \
libquorum.so.5 \
libsystemd.so.0 \
libvotequorum.so.8 \
systemd"

inherit rpm
