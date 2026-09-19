SUMMARY = "MLX4 runtime library"
DESCRIPTION = "This package contains the mlx4 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libmlx4-1-63.0-1.3.aarch64.rpm"
RPM_HASH = "5ac6fb98ce24a547c3c91832e8c62c60d73f8a280389d27692de00d52aeeae86e264b0ed147202b049932d0127d4cf72c1336f516c4b1781fb3f1b60fd0b2124"

RPROVIDES:${PN} += "libmlx4-1 \
libmlx4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
