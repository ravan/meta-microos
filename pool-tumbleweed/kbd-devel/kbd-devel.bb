SUMMARY = "Header files for kbd libraries"
DESCRIPTION = "This subpackage contains header files and toolchain metadata for \
building programs utilizing the kbd component libraries libkbdfile, \
libkfont and libkeymap."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.10.0"

RPM_NAME = "kbd-devel-2.10.0-1.1.aarch64.rpm"
RPM_HASH = "e440a3cdb64eb5c6d8e5535d07f46252667cefb35934ec8b600e4687c1cfabddfde52bf2a6428449b19f2aac8930071b55a59d3650524bd5c8adb8d42ed82929"

RPROVIDES:${PN} += "kbd-devel \
pkgconfig-libkeymap \
pkgconfig-libkfont"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkbdfile1 \
libkeymap1 \
libkfont0"

inherit rpm
