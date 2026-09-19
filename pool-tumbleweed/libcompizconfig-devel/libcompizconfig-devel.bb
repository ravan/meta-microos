SUMMARY = "Development files for libcompizconfig"
DESCRIPTION = "CompizConfig plugin required for compizconfig-settings-manager. \
 \
This package contains development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "libcompizconfig-devel-0.8.18-2.42.aarch64.rpm"
RPM_HASH = "5de44d003bc292edef106b380d51a9b47b74c3d4b7cbe8aecc90d14d2e7ab42004cd1b717be260016a308d749b7d62c7123de8082d4760c6a6c0c978dcfc8990"

RPROVIDES:${PN} += "libcompizconfig-devel \
pkgconfig-libcompizconfig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcompizconfig \
pkgconfig \
pkgconfig-compiz \
pkgconfig-libxml-2.0 \
pkgconfig-protobuf \
pkgconfig-x11"

inherit rpm
