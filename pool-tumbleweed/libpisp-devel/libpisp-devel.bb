SUMMARY = "Development files for the RPi ISP helper library"
DESCRIPTION = "A helper library to generate run-time configuration for the Raspberry Pi \
ISP (PiSP), consisting of the Frontend and Backend hardware components. \
 \
This package contains the header files and other files required for development."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "libpisp-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "190203b382e7f7d1576040b2d3940ed3f0fb2c9e43774e324e8def60ec49368b051b3437ffa230a214625fea254802e7a39e6b0d32c0c37489066ffcba874055"

RPROVIDES:${PN} += "libpisp-devel \
pkgconfig-libpisp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpisp1 \
pkgconfig-nlohmann-json"

inherit rpm
