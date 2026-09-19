SUMMARY = "Development files for wildmidi"
DESCRIPTION = "The wildmidi-devel package contains libraries and header files for \
developing applications that use wildmidi."
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "wildmidi-devel-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "74d862f26c7db0108f90a4abd56d66ba3cf2c74aff990b00db7f9b6f6ea5e3f23478ab7f0357f126d78f100bd2157fb8adc616fae5de53d024eb80bec72f87d2"

RPROVIDES:${PN} += "cmake-WildMidi \
pkgconfig-wildmidi \
wildmidi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libWildMidi2"

inherit rpm
