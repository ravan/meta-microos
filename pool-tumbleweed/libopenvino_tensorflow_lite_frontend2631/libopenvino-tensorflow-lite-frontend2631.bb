SUMMARY = "TensorFlow Lite frontend for OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the tensorflow-lite frontend for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "libopenvino_tensorflow_lite_frontend2631-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "76b4a08f1e6e104b7ba1a3e76ddd99ca62656ab9db07630e0ef22c67a0480123284fa19fa0889f641827a91900b088d7c0b5cc19e907f28aa25fd85d1e5c9109"

RPROVIDES:${PN} += "libopenvino-tensorflow-lite-frontend.so.2631 \
libopenvino-tensorflow-lite-frontend2631"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenvino.so.2631 \
libstdc++.so.6"

inherit rpm
