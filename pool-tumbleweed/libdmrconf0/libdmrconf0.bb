SUMMARY = "Graphical code-plug programming tool for DMR radios"
DESCRIPTION = "qDMR is a simple to use and feature-rich code-plug programming software \
(CPS) for cheap DMR radios. \
 \
This subpackage contains shared library part of libdmrconf."
LICENSE = "GPL-3.0-or-later"

PV = "0.15.1"

RPM_NAME = "libdmrconf0-0.15.1-1.1.aarch64.rpm"
RPM_HASH = "97b93b0fe689e5280fefba24535a75cb55833a289db17bde5f1ee71b30023a3c1fb401e18ec4428522e0b843182e7ed67dbe503653bfc04686387c99429d0071"

RPROVIDES:${PN} += "libdmrconf.so.0 \
libdmrconf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6SerialPort.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libyaml-cpp.so.0.9"

inherit rpm
