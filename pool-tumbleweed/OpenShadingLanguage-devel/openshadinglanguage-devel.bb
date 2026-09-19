SUMMARY = "Development files for OpenShadingLanguage"
DESCRIPTION = "The OpenShadingLanguage-devel package contains libraries and header files for \
developing applications that use OpenShadingLanguage."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "OpenShadingLanguage-devel-1.15.4.0-3.1.aarch64.rpm"
RPM_HASH = "511b01b27a8ca0299ffed1f73348d3d1009bb9498ca2819702d9171b5521eb4d9e93f0797de5d8ba40a8073c9443f24483ae98900270588573d40ffaab7b9822"

RPROVIDES:${PN} += "OpenShadingLanguage-devel \
cmake-OSL \
pkgconfig-oslcomp \
pkgconfig-oslexec \
pkgconfig-oslquery"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
OpenImageIO-plugin-osl \
OpenShadingLanguage \
liboslcomp1-15 \
liboslexec1-15 \
liboslnoise1-15 \
liboslquery1-15 \
libtestshade1-15"

inherit rpm
