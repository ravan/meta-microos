SUMMARY = "Development files for Unified Communication Transport (UC-T)"
DESCRIPTION = "Low-level API that expose network operations supported by underlying \
hardware."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "libuct-devel-1.21.0-1.2.aarch64.rpm"
RPM_HASH = "c088efb788967bd85333b54a4acd19b61b115687d1d9842a15c458096cfcd6c4950c2dac4bfa9b2c60e610f6e3d0716b8089f70a3edd4abfa0b4c6dd5be4b38c"

RPROVIDES:${PN} += "libuct-devel \
pkgconfig-ucx-cma \
pkgconfig-ucx-ib \
pkgconfig-ucx-ib-efa \
pkgconfig-ucx-ib-mlx5 \
pkgconfig-ucx-rdmacm \
pkgconfig-ucx-uct"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuct0 \
pkgconfig-libefa \
pkgconfig-libibverbs \
pkgconfig-libmlx5 \
pkgconfig-librdmacm \
pkgconfig-ucx-ucs"

inherit rpm
