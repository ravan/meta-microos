SUMMARY = "Qucs with SPICE"
DESCRIPTION = "Qucs-S is a spin-off of the Qucs cross-platform circuit simulator. 'S' \
letter indicates SPICE. The purpose of the Qucs-S subproject is to use \
free SPICE circuit simulation kernels with the Qucs GUI It merges the power \
of SPICE and the simplicity of the Qucs GUI. Qucs intentionally uses its \
own SPICE incompatible simulation kernel Qucsator. It has advanced RF and \
AC domain simulation features, but most of the existing industrial SPICE \
models are incompatible with it. Qucs-S is not a simulator by itself, but \
it requires to use a simulation backend with it. The schematic document \
format of Qucs and Qucs-S are fully compatible."
LICENSE = "GPL-2.0-or-later"

PV = "26.1.0"

RPM_NAME = "qucs-s-26.1.0-1.2.aarch64.rpm"
RPM_HASH = "332ad3869efd35bff0cae2ada87d39a4917b03b2aeec395938a6f5433115cef612a784de39a9fcd9bfc99fdca62bf1e48012f7d2169c71ba0fefefea53813e7a"

RPROVIDES:${PN} += "qucs-s"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
ngspice"

inherit rpm
