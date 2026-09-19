SUMMARY = "Header files for libhinawa, a lib for IEEE 1394 async transactions"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libhinawa."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libhinawa-devel-2.4.0-1.19.aarch64.rpm"
RPM_HASH = "1971b27e237745d0cb7c94ccf1dcbe896b8a9edac284a0a23aa8fc33ef6afa9bb97fe26f1bfa1c171a731ee7f028ff88f559c894332d1ab6b5a6e1af143f7414"

RPROVIDES:${PN} += "libhinawa-devel \
pkgconfig-hinawa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhinawa2 \
pkgconfig-gobject-2.0"

inherit rpm
