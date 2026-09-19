SUMMARY = "The 'gif' libextractor plugin"
DESCRIPTION = "This package ships the 'gif' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-gif-1.14-1.2.aarch64.rpm"
RPM_HASH = "024f3dd47b6f016c5df46abb0d357a9bc4abf1cda745a75f1ea7eef1266307c162a0554d00052c725d0980d290b3eb3b55714c103487a9ec5f95ee3f801f4973"

RPROVIDES:${PN} += "libextractor-gif.so \
libextractor-plugins-gif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgif.so.7"

inherit rpm
