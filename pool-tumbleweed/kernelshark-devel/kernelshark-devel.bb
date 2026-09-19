SUMMARY = "Development files for kernelshark"
DESCRIPTION = "Development files for kernelshark"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.4.0"

RPM_NAME = "kernelshark-devel-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "709d7898f337651635e10624daf37cabe704e853ccac2ae075b345a8082f4dbab9e3f75bbd30f1f9cb4206184d3ef6f06d9a6d2631f2e041c7327055e9e84dce"

RPROVIDES:${PN} += "kernelshark-devel \
pkgconfig-libkshark"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kernelshark \
pkgconfig-json-c \
pkgconfig-libtracecmd"

inherit rpm
