SUMMARY = "Development Files for freerdp"
DESCRIPTION = "This package contains development files necessary for developing applications \
based on libfreerdp."
LICENSE = "Apache-2.0"

PV = "2.11.7"

RPM_NAME = "freerdp2-devel-2.11.7-8.4.aarch64.rpm"
RPM_HASH = "9b573763a2badc743950ace0aa00fa5d5ff099f1c291856ea90ffcf379118b751cb17a5de84463832c805d6b48d8f6c3736fda58d6b9850e1c4112364ae32f4d"

RPROVIDES:${PN} += "cmake-FreeRDP \
cmake-FreeRDP-Client \
cmake-FreeRDP-Server \
cmake-FreeRDP-Shadow \
freerdp2-devel \
pkgconfig-freerdp-client2 \
pkgconfig-freerdp-server2 \
pkgconfig-freerdp-shadow2 \
pkgconfig-freerdp2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreerdp2-2 \
pkgconfig-freerdp2 \
pkgconfig-libssl \
pkgconfig-winpr2 \
winpr2-devel"

inherit rpm
