SUMMARY = "Header files and documentation for libstorage-ng"
DESCRIPTION = "This package contains header files and documentation for developing with \
libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.352"

RPM_NAME = "libstorage-ng-devel-4.5.352-1.1.aarch64.rpm"
RPM_HASH = "43f2d2789b0f2785ecc5fb07c026f5badc0f2cd12218c3a9db17550fbaadebc49bdb59c108494cc7bcadea89426de0d5dadf2eefb0587683b60e1bdd179496e2"

RPROVIDES:${PN} += "libstorage-ng-devel"

RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
libstorage-ng1 \
pkgconfig \
pkgconfig-libxml-2.0"

inherit rpm
