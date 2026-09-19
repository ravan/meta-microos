SUMMARY = "Auto / Multi software plugin for OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the Auto / Multi software plugin for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "openvino-auto-plugin-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "75dc0eac94c11386d25f77068ece0d7fd03c0d19604d286215e3fe50256bec16f57b90e1e2a3a24067f21e5b05a4eac9a989ae6b6c2615c9dda556d946deb3be"

RPROVIDES:${PN} += "libopenvino-auto-plugin.so \
openvino-auto-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenvino.so.2631 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
