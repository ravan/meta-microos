SUMMARY = "Data Plane Development Kit development files"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "25.11.3"

RPM_NAME = "dpdk-devel-25.11.3-1.1.aarch64.rpm"
RPM_HASH = "b8df98fc5667da5c1a59450a066d80388d1463c4a05e4d6b6bbbe6706180d72ba6c7ea3a0a18e4e7cbdce6b96732ac32fe63a958e5eb5f41b7f44f575b6735db"

RPROVIDES:${PN} += "dpdk-devel \
dpdk-thunderx-devel \
pkgconfig-libdpdk \
pkgconfig-libdpdk-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
libdpdk-26 \
pkgconfig-jansson \
pkgconfig-libarchive \
pkgconfig-libcrypto \
pkgconfig-libdpdk-libs \
pkgconfig-libelf \
pkgconfig-libibverbs \
pkgconfig-libmana \
pkgconfig-libmlx4 \
pkgconfig-libmlx5 \
pkgconfig-libpcap \
pkgconfig-zlib"

inherit rpm
