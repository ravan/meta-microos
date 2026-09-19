SUMMARY = "PyTorch frontend for OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the pytorch frontend for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "libopenvino_pytorch_frontend2631-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "a31f25c52ccc7a690bf3b73f4cb5f3ea0ceaa3ba46d7ed9a2bd610137eae1b727222f4d49cf62e9bd7f4a798de1c56e2f841ab5e52c3092f866d97f12048337b"

RPROVIDES:${PN} += "libopenvino-pytorch-frontend.so.2631 \
libopenvino-pytorch-frontend2631"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenvino.so.2631 \
libstdc++.so.6"

inherit rpm
