SUMMARY = "Lua scripts used by libquvi -- Development Files"
DESCRIPTION = "libquvi-scripts contains the embedded lua scripts that libquvi uses for \
parsing the media details. Some additional utility scripts are also \
included."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.20131130"

RPM_NAME = "libquvi-scripts-devel-0.9.20131130-4.15.aarch64.rpm"
RPM_HASH = "ca06f754b09cc7d79c29e7a259c0da22aadb71dec8b87bbbe1192edb510e844874ed3c385ed0ef41ecb9e07fcab7230c84467e3e224ea82c44d034c04edf43ee"

RPROVIDES:${PN} += "libquvi-scripts-devel \
pkgconfig-libquvi-scripts-0.9"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libquvi-scripts"

inherit rpm
