SUMMARY = "Development files for c-toxcore"
DESCRIPTION = "Development libraries and headers needed to build software using c-toxcore."
LICENSE = "GPL-3.0-only"

PV = "0.2.23"

RPM_NAME = "c-toxcore-devel-0.2.23-1.3.aarch64.rpm"
RPM_HASH = "6847489018efc235e1c6d4a4da9c8568f79bda88d250e1b3db77259cf1ba9fd1275defbd4bca016a8ab53084973acd10880d7e694b3833e81be32fb198edf485"

RPROVIDES:${PN} += "c-toxcore-devel \
pkgconfig-toxcore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c-toxcore \
libtoxcore2 \
pkgconfig-libsodium \
pkgconfig-opus \
pkgconfig-vpx"

inherit rpm
