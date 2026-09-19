SUMMARY = "Python module for openVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides a Python module for interfacing with openVINO toolkit."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "python3-openvino-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "f0aa66dda19c2a4e6f277d6b372e7d94234db63f5ffa972b6e9f88a67e33d7a72fd17b0a57aedaec43e693e67dd37d931c9867f4855f6b7cc4db6114d9057ebb"

RPROVIDES:${PN} += "python3-openvino \
python3.13dist-openvino \
python3dist-openvino"

RDEPENDS:${PN} += "-python3-numpy >= 1.16.6 with python3-numpy <= 2.5.2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenvino-pytorch-frontend.so.2631 \
libopenvino.so.2631 \
libstdc++.so.6 \
python-abi \
python3-openvino-telemetry"

inherit rpm
