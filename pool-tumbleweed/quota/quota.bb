SUMMARY = "Disk Quota System"
DESCRIPTION = "The quota subsystem allows a system administrator to set soft and hard \
limits on used space and the number of inodes used for users and \
groups. The kernel must be compiled with disk quota support enabled \
(SUSE kernels have this support)."
LICENSE = "GPL-2.0-only"

PV = "4.11"

RPM_NAME = "quota-4.11-1.4.aarch64.rpm"
RPM_HASH = "18dadba95924306a734b0b5793e8ee59fd818383a7f90c0362e4d6e18f4245cc3f5a55cfa543130ccfe663022161b0187472e9864e1b4cf5874e411517051dc8"

RPROVIDES:${PN} += "config-quota \
quota"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libext2fs.so.2 \
liblber.so.2 \
libldap.so.2 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libtirpc.so.3"

inherit rpm
