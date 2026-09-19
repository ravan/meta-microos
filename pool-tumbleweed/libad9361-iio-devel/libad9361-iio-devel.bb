SUMMARY = "Development files for libad9361"
DESCRIPTION = "This is a simple library used for userspace, which manages multi-chip sync, on \
platforms (FMCOMMS5) where multiple AD9361 devices are used."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libad9361-iio-devel-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "fd3196ec2e63c6b4b7117eaf92c6632dcdbb24024a311673d57386b85eaea6b063329a7b8c7b26d4460921a8e8d665da17c31cfad916c43a0e0d7fd90af3d8ca"

RPROVIDES:${PN} += "libad9361-iio-devel \
pkgconfig-libad9361"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libad9361-0"

inherit rpm
