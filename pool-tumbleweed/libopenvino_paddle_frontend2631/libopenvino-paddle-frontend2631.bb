SUMMARY = "Paddle frontend for Intel OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the paddle frontend for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "libopenvino_paddle_frontend2631-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "7523b0ad63ead35242b763f5540f0b137cb37287158bd6a232ad7ffd78b972a5c937ed5952e192194cc94e3bab6bdf609bcb5394b065867d56adad7ba34175cd"

RPROVIDES:${PN} += "libopenvino-paddle-frontend.so.2631 \
libopenvino-paddle-frontend2631"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenvino.so.2631 \
libprotobuf-lite.so.3.21.12.0 \
libstdc++.so.6"

inherit rpm
