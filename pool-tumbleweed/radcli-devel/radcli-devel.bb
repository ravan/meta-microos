SUMMARY = "Header files for libradcli"
DESCRIPTION = "This package contains libraries and header files for developing applications \
that use libradcli."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.5.3"

RPM_NAME = "radcli-devel-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "1425177cc4fc79049c0cf5d900f3fca8516384d862578a88c0e621e4c245cf883a68df77587f1117b6ade3c5c5a6beacdbbd4516e0b190fd6eb696e73fc0eece"

RPROVIDES:${PN} += "pkgconfig-radcli \
radcli-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libradcli10 \
pkgconfig-gnutls \
pkgconfig-nettle"

inherit rpm
