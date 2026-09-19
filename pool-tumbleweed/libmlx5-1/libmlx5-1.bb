SUMMARY = "MLX5 runtime library"
DESCRIPTION = "This package contains the mlx5 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libmlx5-1-63.0-1.3.aarch64.rpm"
RPM_HASH = "beb4b9501c69b39a5256107e0afbb9d09dbf2604c9465b3e5ee933af1e3898594111b9e4076454af6bbd16c755c404908f19afb99c4544fe6a8c806c474109b2"

RPROVIDES:${PN} += "libmlx5-1 \
libmlx5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
