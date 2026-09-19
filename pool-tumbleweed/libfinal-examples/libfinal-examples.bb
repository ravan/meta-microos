SUMMARY = "Example files for the FINAL CUT library"
DESCRIPTION = "FINAL CUT is a class library and widget toolkit with full mouse \
support for creating a text-based user interface. The library supports \
the programmer to develop an application for the text console. It allows \
the simultaneous handling of multiple windows on the screen. \
The C++ class design was inspired by the Qt framework. It provides \
common controls like dialog windows, push buttons, check boxes, \
radio buttons, input lines, list boxes, status bars and so on."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "libfinal-examples-0.9.1-1.10.aarch64.rpm"
RPM_HASH = "8fa24313082947745dc0e10c067be225321b885986fdb78bb94a79ec083304a548c9ab54a6444ca646d5dc1817fccaee009e490afe9ed114bd2936e866567cc3"

RPROVIDES:${PN} += "libfinal-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfinal.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
