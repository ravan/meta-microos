SUMMARY = "Shows how a font gets rendered by FreeType"
DESCRIPTION = "Shows how a font gets rendered by FreeType, allowing \
control over virtually all rendering parameters \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftinspect-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "6d84bbc132dd71312e2825617f21cd8a40b4d929ca716d5c73b217d0aa561a3ddb89b94dd658acfeded94ffebf3d19ee748e9e192536e0f0c641edd0455b421a"

RPROVIDES:${PN} += "ftinspect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
