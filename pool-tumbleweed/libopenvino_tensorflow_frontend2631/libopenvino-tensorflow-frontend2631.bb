SUMMARY = "TensorFlow frontend for OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the tensorflow frontend for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "libopenvino_tensorflow_frontend2631-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "fb1b7a541dd64710fce65e0a4f9ef3c15522d7e67abe399e70ad9d76552d87697f5c2a17486cf25c1a07d1cd9421e74d44eb592fa0644c8523f67dfba89d22ea"

RPROVIDES:${PN} += "libopenvino-tensorflow-frontend.so.2631 \
libopenvino-tensorflow-frontend2631"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenvino.so.2631 \
libprotobuf.so.3.21.12.0 \
libsnappy.so.1 \
libstdc++.so.6"

inherit rpm
