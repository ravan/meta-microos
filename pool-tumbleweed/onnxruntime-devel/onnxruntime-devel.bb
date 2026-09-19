SUMMARY = "Development files for ONNX Runtime"
DESCRIPTION = "Header files, CMake config, and the unversioned shared library symlink \
for developing applications against ONNX Runtime."
LICENSE = "Apache-2.0 & MIT & MPL-2.0 & BSL-1.0 & BSD-2-Clause"

PV = "1.27.0"

RPM_NAME = "onnxruntime-devel-1.27.0-2.1.aarch64.rpm"
RPM_HASH = "5961961af1287175fb651a4a462c594c2021fd59eb7eaad191d377f7d15474fe6b853b89eb9caabebc17ad183ba254efbe025e10947512120602e5f9f811d65e"

RPROVIDES:${PN} += "cmake-onnxruntime \
libonnxruntime-providers-shared.so \
onnxruntime-devel \
pkgconfig-libonnxruntime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libonnxruntime1"

inherit rpm
