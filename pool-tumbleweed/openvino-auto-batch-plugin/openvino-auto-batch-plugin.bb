SUMMARY = "Automatic batch software plugin for OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the automatic batch software plugin for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "openvino-auto-batch-plugin-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "bf8b0efbc45889330e9295260daaa2aa922c1f5da7f51241db72523d7498ee150bcc86e74325ef96615facb2d4bc7c5434303d1a62ea35b0d8a1aa5f7e4916e7"

RPROVIDES:${PN} += "libopenvino-auto-batch-plugin.so \
openvino-auto-batch-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenvino.so.2631 \
libstdc++.so.6"

inherit rpm
