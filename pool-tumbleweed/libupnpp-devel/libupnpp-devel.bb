SUMMARY = "Development files for libupnpp"
DESCRIPTION = "The libupnpp-devel package contains libraries and header files for \
developing applications that use libupnpp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libupnpp-devel-1.0.3-1.5.aarch64.rpm"
RPM_HASH = "ff82fc647f2cb485a95b515e1eec93d7e44a9a3f659abab9168098849e3fd581dc34c388aa121dce5172c85393ab93e699303ea6a5437037eacac9e3b318fe3c"

RPROVIDES:${PN} += "libupnpp-devel \
pkgconfig-libupnpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libupnpp17 \
pkgconfig-expat \
pkgconfig-libcurl \
pkgconfig-libnpupnp"

inherit rpm
