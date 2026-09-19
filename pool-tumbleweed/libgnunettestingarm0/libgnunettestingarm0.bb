SUMMARY = "GNUnet library libgnunettestingarm"
DESCRIPTION = "This package contains the libgnunettestingarm library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettestingarm0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "d4542ebc4efde1eb8522c2d6accb8a81882701234c1e6919d352431d403401d45c63979f0286b78f030d5965340de6f47af9f223a4d988d06f94c4a2418d7aa8"

RPROVIDES:${PN} += "libgnunettestingarm.so.0 \
libgnunettestingarm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetarm.so.2 \
libgnunettestbed.so.0 \
libgnunettesting.so.3 \
libgnunettestingtestbed.so.0 \
libgnunetutil.so.20"

inherit rpm
