SUMMARY = "The Corosync Cluster Engine Qdevice Network Daemon"
DESCRIPTION = "This package contains the Corosync Cluster Engine Qdevice Network Daemon, \
script for creating NSS certificates and an init script."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "corosync-qnetd-3.0.4-4.3.aarch64.rpm"
RPM_HASH = "36caa0f9011a000bc6eb99591db924dc27338717c0c412a844734cda8313fcf7e60cd4df6af445af528f10112afe7a345e1ad9df0f33efd494566f16a48c7316"

RPROVIDES:${PN} += "corosync-qnetd \
group-coroqnetd \
user-coroqnetd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libssl3.so \
libsystemd.so.0 \
mozilla-nss-tools \
shadow \
systemd"

inherit rpm
