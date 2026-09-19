SUMMARY = "Development files for hyprcursor"
DESCRIPTION = "Hyprutils is a small C++ library for utilities used across the Hypr* \
ecosystem. \
 \
This subpackage contains development files for hyprcursor."
LICENSE = "BSD-3-Clause"

PV = "0.14.2"

RPM_NAME = "hyprutils-devel-0.14.2-1.1.aarch64.rpm"
RPM_HASH = "b4562e16c9f8d5483b656e15582726cf09abe3401050b1b7f602c2b282dc4b250117646f547911ec2b46668db791e11d0a0ad82184900f17a9ac9edf8c4e8f1f"

RPROVIDES:${PN} += "hyprutils-devel \
pkgconfig-hyprutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhyprutils13"

inherit rpm
