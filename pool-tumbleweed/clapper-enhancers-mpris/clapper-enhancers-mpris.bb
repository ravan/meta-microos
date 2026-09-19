SUMMARY = "Clapper Enhancer MPRIS"
DESCRIPTION = "MPRIS support"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-enhancers-mpris-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "1396f8a1a0fcbbc826eb35d0a59031672f0b816d28251b58e715584aebee2936981898061d3cdd134604ec72530dddcd287e7b47bfbfdb4a0367c94099773e85"

RPROVIDES:${PN} += "clapper-enhancers-mpris \
libclapper-mpris.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclapper-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpeas-2.so.0"

inherit rpm
