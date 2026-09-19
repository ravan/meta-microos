SUMMARY = "Ceph Object Storage Daemon"
DESCRIPTION = "ceph-osd is the object storage daemon for the Ceph distributed file \
system.  It is responsible for storing objects on a local file system \
and providing access to them over the network."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-osd-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "f94b8ae0fb4463afcc0ad553da3abc48ca4d83bc18dc26b9cb6bb01fad9cff6687b050cc6a01542ae4a4ae59ca07504bb77c77580503a98fb31ac91e7048687a"

RPROVIDES:${PN} += "ceph-osd \
ceph-test-/usr/bin/ceph-osdomap-tool \
config-ceph-osd"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
group-ceph \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap.so.2 \
libceph-common.so.2 \
libcrypto.so.3 \
libfuse3.so.4 \
libgcc-s.so.1 \
libibverbs.so.1 \
liblz4.so.1 \
libm.so.6 \
librdmacm.so.1 \
libresolv.so.2 \
libsnappy.so.1 \
libstdc++.so.6 \
libstoragemgmt \
libtcmalloc.so.4 \
libudev.so.1 \
libz.so.1 \
sudo \
user-ceph"

inherit rpm
