SUMMARY = "Tools for using the InfiniBand SRP protocol devices"
DESCRIPTION = "In conjunction with the kernel ib_srp driver, srp_daemon allows you to \
discover and use SCSI devices via the SCSI RDMA Protocol over InfiniBand."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "srp_daemon-63.0-1.3.aarch64.rpm"
RPM_HASH = "f1583a0bc86c3f35217e511ea43387779c0965ec34a1b840e82eb1f14ab2231b0208763e107a3711c05dcde9718f2740b79ab987aa6a421b2dde7602e5fb64f5"

RPROVIDES:${PN} += "config-srp-daemon \
srp-daemon \
srptools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3 \
libibverbs.so.1 \
rdma-core \
systemd"

inherit rpm
