SUMMARY = "Hetero frontend for Intel OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the hetero frontend for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "openvino-hetero-plugin-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "cd7185df9d1131a99f3bc4f8084e8eaf993a5aad47ed8ba16c60e839d5a8842389e2fc226206f4ea6186c94c42a0b5bccc66c30de5944a744e12f88a4d5f9aa9"

RPROVIDES:${PN} += "libopenvino-hetero-plugin.so \
openvino-hetero-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenvino.so.2631 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
