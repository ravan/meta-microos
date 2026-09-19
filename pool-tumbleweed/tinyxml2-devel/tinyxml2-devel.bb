SUMMARY = "Development files for libtinyxml2"
DESCRIPTION = "Contains libraries and header files for \
developing applications that use libtinyxml2."
LICENSE = "GPL-2.0-or-later"

PV = "11.0.0"

RPM_NAME = "tinyxml2-devel-11.0.0-1.5.aarch64.rpm"
RPM_HASH = "fe58d0eaa8f062e588ca5b79b6c4d784ca543544ffd28f5495d66d6ea7908b8f7f11c0409745203bfcf5eed4a0ea1ce246601bd7e61938bf095c0df1e4d09c26"

RPROVIDES:${PN} += "cmake-tinyxml2 \
pkgconfig-tinyxml2 \
tinyxml2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinyxml2-11"

inherit rpm
