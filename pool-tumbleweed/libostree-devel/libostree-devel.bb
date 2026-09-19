SUMMARY = "Git for operating system binaries -- Development files"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2026.4"

RPM_NAME = "libostree-devel-2026.4-1.1.aarch64.rpm"
RPM_HASH = "02c36bccf2b975e9815dec11a95f7ddb1758f0382f981b9812ea1fc58697d697e5091b04769cc6fd64a19ba00ebfdc740d6fd77f6d95e8b23d114440e380d6f5"

RPROVIDES:${PN} += "libostree-devel \
ostree-devel \
pkgconfig-ostree-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libostree-1-1 \
pkgconfig-composefs \
pkgconfig-gio-unix-2.0 \
pkgconfig-gpg-error \
pkgconfig-gpgme \
pkgconfig-libarchive \
pkgconfig-libcrypto \
pkgconfig-libcurl \
pkgconfig-liblzma \
pkgconfig-libselinux \
pkgconfig-libsystemd \
pkgconfig-zlib \
typelib-1-0-OSTree-1-0"

inherit rpm
