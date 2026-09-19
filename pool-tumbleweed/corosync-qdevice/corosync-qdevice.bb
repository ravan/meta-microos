SUMMARY = "The Corosync Cluster Engine Qdevice"
DESCRIPTION = "This package contains the Corosync Cluster Engine Qdevice, script for creating \
NSS certificates and an init script."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "corosync-qdevice-3.0.4-4.3.aarch64.rpm"
RPM_HASH = "8e94f3f9a8d35e0e793ef5b89cbe81199b24e5ee91e2794b386af518980d4e995f968d06109f289ca5a1cb1a55ce115d27309a8b907252f9ec2ab1bd6b646f31"

RPROVIDES:${PN} += "corosync-qdevice"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
corosync \
corosync-libs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmap.so.4 \
libcorosync-common.so.4 \
libnspr4.so \
libnss3.so \
libssl3.so \
libsystemd.so.0 \
libvotequorum.so.8 \
mozilla-nss-tools \
systemd"

inherit rpm
