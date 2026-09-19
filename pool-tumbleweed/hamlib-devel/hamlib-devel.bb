SUMMARY = "Development files for hamlib, a set of radio control libraries"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.7.2"

RPM_NAME = "hamlib-devel-4.7.2-1.3.aarch64.rpm"
RPM_HASH = "de1dd2f202344e8c5dd234888157f0060dd01e5b8108f690fcac3b0dbbab3e872de95dc6d9ba260865cf5c953ab9096e3c0137ca08341bf9a7b37cbb7b0fb69d"

RPROVIDES:${PN} += "hamlib-devel \
pkgconfig-hamlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhamlib++4 \
libhamlib4 \
pkgconfig-libusb-1.0"

inherit rpm
