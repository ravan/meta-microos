SUMMARY = "exFAT file system implementation"
DESCRIPTION = "This driver is an exFAT file system implementation with write \
support. exFAT is a simple file system created by Microsoft. It is \
intended to replace FAT32, removing some of its limitations. exFAT is \
a standard FS for SDXC memory cards."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "fuse-exfat-1.4.0-3.12.aarch64.rpm"
RPM_HASH = "83fff29ef0f7e8df6750b7f20907893a85ea4dc848e0f1401386ebd6fdc1f3976fc6e0128295675a4e66c21508e8da633fa07de8bf5927c9a7864a78d2e53d7e"

RPROVIDES:${PN} += "fuse-exfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4"

inherit rpm
