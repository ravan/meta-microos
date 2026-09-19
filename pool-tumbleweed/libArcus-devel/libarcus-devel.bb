SUMMARY = "Header files for libArcus"
DESCRIPTION = "The libArcus-devel package includes the header files, libraries and development \
tools necessary for compiling and linking programs which use libArcus."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libArcus-devel-4.13.1-9.14.aarch64.rpm"
RPM_HASH = "6b044cd4b9504eae2504e0e368cb22dd56aac11401280d85e528e9352fd5de0964e29303b0dffb1111d409bcefeccbc80fdbb234af9f3d8c63b25ef0cd1a869b"

RPROVIDES:${PN} += "cmake-Arcus \
libArcus-devel"

RDEPENDS:${PN} += "libArcus3 \
protobuf-devel \
python3-sip4-devel"

inherit rpm
