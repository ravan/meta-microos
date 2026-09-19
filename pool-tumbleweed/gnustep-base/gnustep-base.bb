SUMMARY = "GNUstep Base library package"
DESCRIPTION = "The GNUstep Base Library is a library of general-purpose, \
non-graphical Objective C classes, inspired by the \
OpenStep API but implementing Apple and GNU additions to the API \
as well."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.31.1"

RPM_NAME = "gnustep-base-1.31.1-2.8.aarch64.rpm"
RPM_HASH = "9eec85612113a603542105cc1c0ede0e34a88aa9bd5862a0dcd93d1b502d7274768889f447d35d70c029154fec5a8838f8436f53b806c31c0ecf5ac7f532bb41"

RPROVIDES:${PN} += "config-gnustep-base \
gnustep-base"

RDEPENDS:${PN} += "/usr/bin/sh \
gnustep-make \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnustep-base.so.1.31 \
libobjc.so.4"

inherit rpm
