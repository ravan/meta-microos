SUMMARY = "Development files for LibLogging stdlog library"
DESCRIPTION = "The liblogging-devel package includes header files, libraries necessary for \
developing programs which use liblogging library."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "liblogging-devel-1.0.6-7.5.aarch64.rpm"
RPM_HASH = "d4308446f960b60187959797de69947880824073c5c49e83e27eeee068b4b090a2b998fdceaa8b19a92802fdb816cf5479ab488c992bd093f1fec29b2fdf6ac4"

RPROVIDES:${PN} += "liblogging-devel \
pkgconfig-liblogging-rfc3195 \
pkgconfig-liblogging-stdlog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblogging0"

inherit rpm
