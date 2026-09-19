SUMMARY = "Filesystem regression test suite"
DESCRIPTION = "The filesystem regression test suite. Contains around 1500+ specific tests for \
userspace and kernelspace for several linux filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1+git.20251118"

RPM_NAME = "xfstests-1.1.1+git.20251118-1.5.aarch64.rpm"
RPM_HASH = "f7d1a685f3970a373c04a9f012c01bacd864d035e9ee88c085d346fb7e48af7b8648101b430516ea7e362baab88d421495fb2900b23bfa3e9edfcd9d467d824b"

RPROVIDES:${PN} += "xfstests"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
acl \
attr \
bash \
bc \
bind-utils \
btrfsprogs \
coreutils \
device-mapper \
duperemove \
e2fsprogs \
keyutils \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libaio.so.1 \
libc.so.6 \
libcap-progs \
libgdbm-compat.so.4 \
libhandle.so.1 \
libuuid.so.1 \
lvm \
perl \
quota \
xfsdump \
xfsprogs \
xz"

inherit rpm
