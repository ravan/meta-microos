SUMMARY = "SMB for FUSE"
DESCRIPTION = "SMB for fuse (FUSE) is a filesystem which allows to mount a full \
Network Neighborhood with samba (Samba) and other SMB shares. It works \
like smbfs, but instead of accessing one share at a time, all computers \
and workgroups are accessible at once from a single filesystem mount, \
making network browsing just as easy as it is on Windows."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.7"

RPM_NAME = "fusesmb-0.8.7-130.10.aarch64.rpm"
RPM_HASH = "80313b4328830e0e6ad0116a29fcac0d7f0920017ddfed2a7fa2f406cc48e4bcf482c94e3d2694232f1e1f4f4bac8f82ebec988fed858d69b953bef8fe2395c8"

RPROVIDES:${PN} += "fusesmb"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libsmbclient.so.0"

inherit rpm
