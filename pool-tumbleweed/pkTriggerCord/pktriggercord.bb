SUMMARY = "Remote control program for Pentax DSLR cameras"
DESCRIPTION = "pkTriggerCord is a remote control program for Pentax DSLR cameras."
LICENSE = "LGPL-3.0-only"

PV = "0.85.00+git.20220806"

RPM_NAME = "pkTriggerCord-0.85.00+git.20220806-1.14.aarch64.rpm"
RPM_HASH = "4f9d64fb6f38a9b6dfbf024ee62d116fb66e7264bb623ec5854ba4d7382f40d0b78a5d5d3cdd58d6fc4a24606ead7be71743dc9d03215610314e5bf1a236f495"

RPROVIDES:${PN} += "pkTriggerCord"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm
