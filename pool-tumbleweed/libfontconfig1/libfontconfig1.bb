SUMMARY = "Library for font configuration"
DESCRIPTION = "Fontconfig is a library for configuring and customizing font access. It \
contains two essential modules: the configuration module, which builds \
an internal configuration from XML files, and the matching module, \
which accepts font patterns and returns the nearest matching font."
LICENSE = "MIT"

PV = "2.18.1"

RPM_NAME = "libfontconfig1-2.18.1-1.3.aarch64.rpm"
RPM_HASH = "d9720dff89ae2e3377087611cb6d06d89e988a583347764da863d41bd4ac9fee914be43b7aeb5c8e01b7e7e2c2482474f994fddf26a197e1b662c7fc3deca239"

RPROVIDES:${PN} += "libfontconfig.so.1 \
libfontconfig1"

RDEPENDS:${PN} += "/sbin/ldconfig \
fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libfreetype.so.6"

inherit rpm
