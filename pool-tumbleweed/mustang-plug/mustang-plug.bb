SUMMARY = "Software for Fender Mustang amps"
DESCRIPTION = "Graphical interface to control amplifier and effect stages \
of Fender Mustang guitar amplifiers."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "mustang-plug-1.4.3-2.12.aarch64.rpm"
RPM_HASH = "22fa6383b5c75c9ec2a2eea44100edbddaad80f26e477c6ae3c2820514c9f77d7711a8cbfdc56e03156fec2bf23f4d99915521ab70b0020ca1fc4f0c13099d6b"

RPROVIDES:${PN} += "mustang-plug"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
