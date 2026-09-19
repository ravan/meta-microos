SUMMARY = "Daemon to manage RDMA Node Description"
DESCRIPTION = "rdma-ndd is a system daemon which watches for rdma device changes and/or \
hostname changes and updates the Node Description of the rdma devices based \
on those changes."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "rdma-ndd-63.0-1.3.aarch64.rpm"
RPM_HASH = "3e5bc3dc295f6fb01abe765d9a3a21ad4adf2e93035ee22b07d0ac2ec128fc1d1601db260fd37a60423905d0ac1ebd0f20a975e3f361429990c54a00ae8db0c4"

RPROVIDES:${PN} += "rdma-ndd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libudev.so.1 \
rdma-core \
systemd"

inherit rpm
