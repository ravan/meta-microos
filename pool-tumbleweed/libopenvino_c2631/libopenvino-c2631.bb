SUMMARY = "Shared C library for OpenVINO toolkit"
DESCRIPTION = "This package provides the C library for OpenVINO."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "libopenvino_c2631-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "627d403f7be476910056163bd7125fe38d0326a58a96ad11ebce1aa52862048e77a67fcf86b1dbfb4576738a5512cb44fb708ac26566deee99d1bd1db5b302c5"

RPROVIDES:${PN} += "libopenvino-c.so.2631 \
libopenvino-c2631"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenvino.so.2631 \
libstdc++.so.6"

inherit rpm
