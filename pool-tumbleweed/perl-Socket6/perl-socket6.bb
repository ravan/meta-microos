SUMMARY = "IPv6 related part of the C socket.h defines and structure manipulators"
DESCRIPTION = "This module provides glue routines to the various IPv6 functions. \
 \
If you use the Socket6 module, be sure to specify 'use Socket' as well as \
'use Socket6'."
LICENSE = "BSD-3-Clause"

PV = "0.290.0"

RPM_NAME = "perl-Socket6-0.290.0-1.8.aarch64.rpm"
RPM_HASH = "a8adc637efbda8e3d81b77c0e0b6604e59398aa4789392702b6b0e4405f8030c6d278b24f893585daf16841ad25c0f976c986c4187b8698f7ad68a30122675df"

RPROVIDES:${PN} += "perl-Socket6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
