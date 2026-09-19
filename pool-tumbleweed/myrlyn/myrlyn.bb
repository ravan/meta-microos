SUMMARY = "Package manager GUI"
DESCRIPTION = "Myrlyn is a graphical package manager to select software packages \
and patterns for installation, update and removal. \
 \
It uses libzypp as its backend and Qt as its GUI toolkit."
LICENSE = "GPL-2.0-only"

PV = "1.0.0"

RPM_NAME = "myrlyn-1.0.0-1.6.aarch64.rpm"
RPM_HASH = "d1ac5e91aea131018118282dbd88bc939a8cad166660f9d7138f4e3565daae9c8b9eaaec78138015dbe45a029971972db46d3fc91c2e587d7d42be991d57c16c"

RPROVIDES:${PN} += "myrlyn"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libzypp.so.1735"

inherit rpm
