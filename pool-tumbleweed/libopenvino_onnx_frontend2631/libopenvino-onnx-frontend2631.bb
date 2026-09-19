SUMMARY = "Onnx frontend for OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the onnx frontend for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "libopenvino_onnx_frontend2631-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "7fe503962387b686dcd1fb9c9ad53e11d7c0ecade79265ebe6a118e752bb852d1ec3b99c7a51c4b280024c265b48dfad90157f7e423b7e451a7952102bc70f4f"

RPROVIDES:${PN} += "libopenvino-onnx-frontend.so.2631 \
libopenvino-onnx-frontend2631"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenvino.so.2631 \
libprotobuf-lite.so.3.21.12.0 \
libstdc++.so.6"

inherit rpm
