SUMMARY = "Headers and library for librealsense"
DESCRIPTION = "Headers and cmake project files for developing librealsense applications."
LICENSE = "Apache-2.0"

PV = "2.58.3"

RPM_NAME = "librealsense-devel-2.58.3-1.1.aarch64.rpm"
RPM_HASH = "71a27e323aacc3f8bd09e00586f2c1cd3f06076826945bc2b86703ea7984d06edcbc2b48a0b0e62f9eabea567d45bcac5b2fd40015354ef72fdc640305bb4973"

RPROVIDES:${PN} += "cmake-realsense2 \
cmake-realsense2-gl \
librealsense-devel \
librealsense-file.so \
pkgconfig-realsense2 \
pkgconfig-realsense2-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librealsense2-58 \
libsqlite3.so.0 \
libstdc++.so.6 \
libyaml-cpp.so.0.9 \
pkgconfig-realsense2"

inherit rpm
