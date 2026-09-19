SUMMARY = "RDMA core userspace libraries and daemons"
DESCRIPTION = "RDMA core userspace infrastructure and documentation, including initialization \
scripts, kernel driver-specific modprobe override configs, IPoIB network \
scripts, dracut rules, and the rdma-ndd utility."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "rdma-core-63.0-1.3.aarch64.rpm"
RPM_HASH = "f87ccbfd4965b2139efb62d78af5439368e21489bd7beeef9ed54acea62c2a28ebe89a3d4e5dc3e65ab911300a069d5d65de9fa85439e74404cfbfa59f55e798"

RPROVIDES:${PN} += "config-rdma-core \
ofed \
rdma \
rdma-core"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
kmod \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
systemd"

inherit rpm
