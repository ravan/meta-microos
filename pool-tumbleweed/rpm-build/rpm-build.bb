SUMMARY = "Tools and Scripts to create rpm packages"
DESCRIPTION = "If you want to build a rpm, you need this package. It provides rpmbuild \
and requires some packages that are usually required."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-build-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "85b02711243d11ba6fca383a19f714e6431d241445ef58428fa65d614657ccc15587d0e2e7926a349841eba7dd500c22c72b0632f0b93e1942e92a3c44da0505"

RPROVIDES:${PN} += "rpm-/usr/bin/rpmbuild \
rpm-build \
rpmbuild"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/gzip \
/usr/bin/sh \
binutils \
bzip2 \
coreutils \
cpio \
debugedit \
diffutils \
dwz \
file \
findutils \
gawk \
gcc \
gettext-tools \
glibc-devel \
glibc-locale-base \
grep \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libelf.so.1 \
libpopt.so.0 \
librpm.so.10 \
librpmbuild.so.10 \
librpmbuild10 \
librpmio.so.10 \
make \
patch \
rpm \
sed \
systemd-rpm-macros \
tar \
util-linux \
which \
xz"

inherit rpm
