SUMMARY = "Userspace iWarp Port Mapper daemon"
DESCRIPTION = "iwpmd provides a userspace service for iWarp drivers to claim \
tcp ports through the standard socket interface."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "iwpmd-63.0-1.3.aarch64.rpm"
RPM_HASH = "23d335656559fa4e038e456f72954f5f3d24bb8c517e19559905b7b2fd88e77b56aee695ea13b4376fc3d996d17fac1b732e07ddde69e043e0bd2c48af6ddeb3"

RPROVIDES:${PN} += "config-iwpmd \
iwpmd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libsystemd.so.0 \
rdma-core \
systemd"

inherit rpm
