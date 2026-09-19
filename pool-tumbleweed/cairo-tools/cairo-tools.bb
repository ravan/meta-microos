SUMMARY = "Utilities for cairo, a Vector Graphics Library with Cross-Device Output Support"
DESCRIPTION = "Cairo is a vector graphics library with cross-device output support. \
Currently supported output targets include the X Window System, \
in-memory image buffers, and PostScript. Cairo is designed to produce \
identical output on all output media while taking advantage of display \
hardware acceleration when available. \
 \
This package contains various cairo utilities."
LICENSE = "GPL-3.0-or-later"

PV = "1.18.4"

RPM_NAME = "cairo-tools-1.18.4-4.5.aarch64.rpm"
RPM_HASH = "0f4b25f86a47b8ae710b13b98bfa6210cda37578b4409995d31eda0fa3d7314e93a9084379e6b81e8c677c30a9bfb7733ea023601610d8d824666b1c3a099732"

RPROVIDES:${PN} += "cairo-tools \
cairo-utils \
libcairo-fdr.so \
libcairo-trace.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo2 \
libz.so.1"

inherit rpm
