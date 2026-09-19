SUMMARY = "Handles OS-specific details when using serial ports"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
libserialport is a minimal, cross-platform shared library written in C \
that is intended to take care of the OS-specific details when writing \
software that uses serial ports."
LICENSE = "LGPL-3.0-or-later"

PV = "0.1.2"

RPM_NAME = "libserialport-devel-0.1.2-1.7.aarch64.rpm"
RPM_HASH = "54c246a2061ab82a7de2eb5859b6efb77b75ab8e44cf9b92261d37a042a646678df0493e7bf4d54d1c168748a494c3a5c8a528342c61f67770024166be02340d"

RPROVIDES:${PN} += "libserialport-devel \
pkgconfig-libserialport"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libserialport0"

inherit rpm
