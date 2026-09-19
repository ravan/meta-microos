SUMMARY = "Development files for libcloudproviders"
DESCRIPTION = "The libcloudproviders-devel package contains libraries and header files for \
developing applications that use libcloudproviders."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.1"

RPM_NAME = "libcloudproviders-devel-0.4.1-1.1.aarch64.rpm"
RPM_HASH = "dae6d9e69f5d79a1f3aab4fc6ac0ed697de4f7c9b782cafdb700a8ab389b5321a8a7a4e67a5944f964fbd9b0b07d9a0426db9e2e4868ef20848fa8b9d18d677b"

RPROVIDES:${PN} += "libcloudproviders-devel \
pkgconfig-cloudproviders"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcloudproviders0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0"

inherit rpm
