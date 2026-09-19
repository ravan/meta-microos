SUMMARY = "Development files for libacars"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libacars."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "libacars2-devel-2.2.1-1.4.aarch64.rpm"
RPM_HASH = "607d9035beb043185fea08891a974d07c40081935887d1688a74e016a56fd70cc64272cf46f196431f92b11c028c487c398ecfa48fedab7df724adaca076be58"

RPROVIDES:${PN} += "libacars2-devel \
pkgconfig-libacars-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libacars-2-2"

inherit rpm
