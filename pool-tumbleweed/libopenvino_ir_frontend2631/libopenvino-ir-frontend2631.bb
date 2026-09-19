SUMMARY = "Paddle frontend for Intel OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the ir frontend for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "libopenvino_ir_frontend2631-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "d827e9b45133d831c2e7bd2395d2d80c81240ff322256a6f462eb0a5b6a919d784c3783bfdf06f80b4b3b180b0d1cf81acdf73b375607f2f3088e3dda3698e04"

RPROVIDES:${PN} += "libopenvino-ir-frontend.so.2631 \
libopenvino-ir-frontend2631"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenvino.so.2631 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
