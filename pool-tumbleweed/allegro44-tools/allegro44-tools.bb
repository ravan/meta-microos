SUMMARY = "Extra tools for the Allegro programming library"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming. This package contains extra \
tools which are useful for developing Allegro programs."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-tools-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "3625b89de2db9f66d887268019579424b7518a0568eea559dcf386c7bfe5ecd276930428f4e439934d97d31ea516970de574cef3fa766de7d51da74e3573d2a4"

RPROVIDES:${PN} += "allegro44-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libjpgalleg.so.4.4 \
libm.so.6"

inherit rpm
