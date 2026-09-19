SUMMARY = "Development headers and files for libbsd"
DESCRIPTION = "The libbsd-ctor static library is required if setproctitle() is to be used \
when libbsd is loaded via dlopen() from a threaded program.  This can be \
configured using 'pkg-config --libs libbsd-ctor'."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "libbsd-ctor-static-0.11.7-2.12.aarch64.rpm"
RPM_HASH = "456bbe9e7ba011133200df61c5346765d58d647daa3b526c640dea3bb25cb720977d542e72359ac7c34fabdba0546d5d04f5bb40acce38fc8c0a6d5dd2bc1d95"

RPROVIDES:${PN} += "libbsd-ctor-static \
pkgconfig-libbsd-ctor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbsd0 \
pkgconfig \
pkgconfig-libbsd"

inherit rpm
