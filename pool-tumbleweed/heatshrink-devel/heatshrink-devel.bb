SUMMARY = "Development files for the heatshrink data compression library"
DESCRIPTION = "Header and CMake configuration files required to develop applications using heatshrink"
LICENSE = "ISC & AGPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "heatshrink-devel-0.4.1-1.11.aarch64.rpm"
RPM_HASH = "435c57971662955bc104d0f86f63e354d15faba0d4120bc93a711815384eb0cfb0b8fcc4a5c60f02fec64cf3a363c15b80d1755dddf0e76c60bd86ea2f951d7d"

RPROVIDES:${PN} += "cmake-heatshrink \
heatshrink-devel"

RDEPENDS:${PN} += "libheatshrink-dynalloc0-4-1 \
libheatshrink0-4-1"

inherit rpm
