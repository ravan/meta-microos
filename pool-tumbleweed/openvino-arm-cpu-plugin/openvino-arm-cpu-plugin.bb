SUMMARY = "Intel CPU plugin for OpenVINO toolkit"
DESCRIPTION = "OpenVINO is an open-source toolkit for optimizing and deploying AI inference. \
 \
This package provides the ARM CPU plugin for OpenVINO on aarch64 archs."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & HPND & JSON & MIT & OFL-1.1 & Zlib"

PV = "2026.3.1"

RPM_NAME = "openvino-arm-cpu-plugin-2026.3.1-1.2.aarch64.rpm"
RPM_HASH = "08deee09072219a4f34001aeca621b2aa5535365014dfdd5b3955212fe02faa0e54ce2cc453bbea6814328f2fff7db051969e6a99633a20873c8014ab516023a"

RPROVIDES:${PN} += "libopenvino-arm-cpu-plugin.so \
openvino-arm-cpu-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenvino.so.2631 \
libpugixml.so.1 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
