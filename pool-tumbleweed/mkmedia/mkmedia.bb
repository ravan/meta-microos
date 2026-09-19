SUMMARY = "Tool to create and modify SUSE, Fedora, Red Hat Linux installation media"
DESCRIPTION = "Tool to create and modify SUSE, Fedora, Red Hat Linux installation media."
LICENSE = "GPL-3.0+"

PV = "6.2"

RPM_NAME = "mkmedia-6.2-1.1.aarch64.rpm"
RPM_HASH = "1fc5b8d6bfa8a23a8d617379421b76c74f1442fe2ee1220bdd475553ceeaaac09100c4f6917c3025f49f269c2d9ed35e876638d3594bd01ddba05db3475dd945"

RPROVIDES:${PN} += "mkmedia \
mksusecd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
binutils \
checkmedia \
coreutils \
cpio \
createrepo-c \
dosfstools \
file \
findutils \
gzip \
kmod \
libblkid.so.1 \
libc.so.6 \
libjson-c.so.5 \
libuuid.so.1 \
mtools \
perl-Digest-HMAC \
perl-JSON \
rpm \
tar \
util-linux \
xz \
zstd"

inherit rpm
