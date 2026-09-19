SUMMARY = "RDMA core development libraries and headers"
DESCRIPTION = "RDMA core development libraries and headers."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "rdma-core-devel-63.0-1.3.aarch64.rpm"
RPM_HASH = "aa11c96b7b3a7b2560b037d78fdc12b56f4303fa0195905d3b00c1a44d4ce69d54bf7426920178ef723cf75d9f85a0b02cc2b7ccdde3dfb4df72ecb97c3dc285"

RPROVIDES:${PN} += "ibacm-devel \
infiniband-diags-devel \
libibmad-devel \
libibumad-devel \
libibverbs-devel \
librdmacm-devel \
pkgconfig-libefa \
pkgconfig-libhns \
pkgconfig-libibmad \
pkgconfig-libibnetdisc \
pkgconfig-libibumad \
pkgconfig-libibverbs \
pkgconfig-libionic \
pkgconfig-libmana \
pkgconfig-libmlx4 \
pkgconfig-libmlx5 \
pkgconfig-librdmacm \
rdma-core-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
infiniband-diags \
libefa1 \
libhns1 \
libibumad3 \
libibverbs1 \
libionic1 \
libmana1 \
libmlx4-1 \
libmlx5-1 \
librdmacm1 \
pkgconfig-libibmad \
pkgconfig-libibumad \
pkgconfig-libibverbs \
rdma-core \
rsocket"

inherit rpm
