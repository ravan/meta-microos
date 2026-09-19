SUMMARY = "Development files for libopenmpt-modplug"
DESCRIPTION = "The libopenmpt-modplug-devel package contains libraries and header files for \
developing applications that use libopenmpt-modplug."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.0"

RPM_NAME = "libopenmpt-modplug-devel-0.8.9.0-1.22.aarch64.rpm"
RPM_HASH = "29d90fe38de413dd6f7d9a814db4bc69d165cc704c9f0cff50da8f0b13df8b74a6327e60da6a206e947469c795899d069056f20223e781b5ddb4451766d47831"

RPROVIDES:${PN} += "libopenmpt-modplug-devel \
pkgconfig-libopenmpt-modplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenmpt-modplug1 \
pkgconfig-libopenmpt"

inherit rpm
