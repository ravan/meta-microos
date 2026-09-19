SUMMARY = "Tool for the automation of building and testing of software"
DESCRIPTION = "Tool for the automation of building and testing of software. It supports Java, \
C++ and Go as programing languages. It also has a support for Android and iOS \
as mobile operating systems."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & GPL-2.0-or-later & BSD-2-Clause & Python-2.0 & Zlib & BSL-1.0"

PV = "8.4.1"

RPM_NAME = "bazel8-8.4.1-1.7.aarch64.rpm"
RPM_HASH = "60d9683a8e87fa8ca1584b01bbdfd9b0f61126121efaf5a1818bc2d22a66a1cf8d221678c8c66f8022df2f31583caf8570b3e25edab74ecf9fe77b62fba9f316"

RPROVIDES:${PN} += "bazel \
bazel8"

RDEPENDS:${PN} += "/usr/bin/sh \
java-21-openjdk-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
