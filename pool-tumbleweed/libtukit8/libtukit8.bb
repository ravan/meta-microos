SUMMARY = "Library for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "This package contains the libraries required for programs to do \
transactional updates using btrfs snapshots."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "6.1.3"

RPM_NAME = "libtukit8-6.1.3-1.2.aarch64.rpm"
RPM_HASH = "906c4725b5d0251368572baa0492bfd492873789067f1ddc502e5fc7d72d4cf4b4904d1ee32a14b06dd07942e9860a6611bdbf6d11610fc7f949d17a21d1ec29"

RPROVIDES:${PN} += "libtukit.so.8 \
libtukit8"

RDEPENDS:${PN} += "/sbin/ldconfig \
btrfsprogs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0 \
libgcc-s.so.1 \
libmount.so.1 \
libselinux.so.1 \
libstdc++.so.6 \
rsync \
snapper"

inherit rpm
