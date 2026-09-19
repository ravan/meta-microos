SUMMARY = "pkgconf shim to provide /usr/bin/pkg-config"
DESCRIPTION = "This package provides the shim links for pkgconf to be automatically \
used in place of pkgconfig. This ensures that pkgconf is used as \
the system provider of pkg-config."
LICENSE = "ISC"

PV = "2.5.1"

RPM_NAME = "pkgconf-pkg-config-2.5.1-1.5.aarch64.rpm"
RPM_HASH = "34717299bf96126a16d1bf24c9bb44c161eb2f3c97dd46c633fc47a95923ca4ba2a6f9d9ff53168291b8296c53dc50e3fa2d99626d9e8d1f6c655a9bf84bb8fd"

RPROVIDES:${PN} += "pkg-config \
pkgconf-pkg-config \
pkgconfig \
pkgconfig-pkg-config"

RDEPENDS:${PN} += "/usr/bin/sh \
pkgconf \
pkgconf-m4"

inherit rpm
