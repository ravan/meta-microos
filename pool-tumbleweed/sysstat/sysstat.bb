SUMMARY = "Sar and Iostat Commands for Linux"
DESCRIPTION = "Sar and Iostat commands for Linux. The sar command collects and reports \
system activity information. The iostat command reports CPU statistics \
and I/O statistics for TTY devices and disks.  The information \
collected by sar and iostat can be saved in a binary file for future \
inspection. Both commands now support SMP machines when displaying CPU \
utilization."
LICENSE = "GPL-2.0-or-later"

PV = "12.7.9"

RPM_NAME = "sysstat-12.7.9-1.3.aarch64.rpm"
RPM_HASH = "273c14a25902837e7d8da72690a8d7f9a5d480bd5f3a24683a66e3da53958f5ce9ee67395677e8b2af31bff16f8c30f594f27566caef9a1c7761d97495beb05b"

RPROVIDES:${PN} += "config-sysstat \
sysstat"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-import.so.1 \
libpcp.so.3 \
libsensors.so.4 \
util-linux \
xz"

inherit rpm
