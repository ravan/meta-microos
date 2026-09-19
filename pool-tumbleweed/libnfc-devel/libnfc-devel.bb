SUMMARY = "Development files for the Near Field Communications library"
DESCRIPTION = "libnfc is a low-level SDK for various RFID and NFC applications. \
 \
It supports various NFC hardware devices: dongles, flat and OEM \
devices. The library currently supports modulations for ISO/IEC 14443 \
(A and B), FeliCa, Jewel tags and Data Exchange Protocol (P2P) as \
target and as initiator. \
 \
This package contains the libnfc development files."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libnfc-devel-1.8.0-2.6.aarch64.rpm"
RPM_HASH = "ed6f8b92c470b2b1b845a05edc37da8cb1dc382e0a9d583fef111d938dbdc22592326f4cb04506c8cc341e06dc5c07eca8bc8ef82581334bfb2c83bb1e7f2b10"

RPROVIDES:${PN} += "libnfc-devel \
pkgconfig-libnfc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfc6 \
pkgconfig-libpcsclite \
pkgconfig-libusb"

inherit rpm
