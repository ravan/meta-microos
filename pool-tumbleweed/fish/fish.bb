SUMMARY = "The 'friendly interactive shell'"
DESCRIPTION = "fish is a command line shell. \
It is geared towards interactive use and its features are focused on user \
friendlieness and discoverability. The language syntax is simple but \
incompatible with other shell languages."
LICENSE = "BSD-3-Clause & GPL-2.0-only & ISC & LGPL-2.0-or-later & MIT & PSF-2.0"

PV = "4.8.1"

RPM_NAME = "fish-4.8.1-1.2.aarch64.rpm"
RPM_HASH = "3f53138ae46203c7589431cd49f401a1d958e96574af26d475fd9bb50a9ea10436af037a0a00c5e78fde34201afcf4c32d28c50b4ad5ce266116afa8f42cf771"

RPROVIDES:${PN} += "config-fish \
fish"

RDEPENDS:${PN} += "/usr/bin/sh \
awk \
bc \
gzip \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-32.so.0 \
libpcre2-8.so.0 \
man"

inherit rpm
