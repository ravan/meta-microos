SUMMARY = "Development files for the libcomps library"
DESCRIPTION = "This package provides the development files for libcomps."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.21"

RPM_NAME = "libcomps-devel-0.1.21-2.7.aarch64.rpm"
RPM_HASH = "7fd490e7c246e43523d8f727bcb307e26f18a8d12c60a2d52ddb8f72ef32746df6d81e1eaf4bb3a716cda3a17b17473a219d12dab4824524613ee3dc57f4f46a"

RPROVIDES:${PN} += "libcomps-devel \
pkgconfig-libcomps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcomps0 \
pkgconfig \
pkgconfig-expat \
pkgconfig-libxml-2.0"

inherit rpm
