SUMMARY = "Shared library for OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the shared library for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "libopenvino2631-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "f45e21080bfa9c23e20f4f3976eea10d0aa4278f3235556272648c8272d22d81121927702fbd9f0292317c6d9cf0e7be4a690f4e7ac7bfc8ac0e00c60e5b6a29"

RPROVIDES:${PN} += "libopenvino.so.2631 \
libopenvino2631"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
