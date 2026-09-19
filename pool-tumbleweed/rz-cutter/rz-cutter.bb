SUMMARY = "GUI for Rizin reverse engineering framework"
DESCRIPTION = "Cutter is a Qt and C++ GUI for Rizin. Its goal is making an advanced, \
customizable and FOSS reverse-engineering platform while keeping the user \
experience at mind. Cutter is created by reverse engineers for reverse \
engineers."
LICENSE = "GPL-3.0-only"

PV = "2.5.0"

RPM_NAME = "rz-cutter-2.5.0-1.2.aarch64.rpm"
RPM_HASH = "190d4fe140babe3317e2f0924198ed98b6b8ecd78e0b5c4ebd5c07297f93aff4a688acf89f012fd82029b25c02cf8e3479918612ec4876861b948af209b16834"

RPROVIDES:${PN} += "rz-cutter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6SyntaxHighlighting.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libgvc.so.7 \
libm.so.6 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
librz-arch.so.0.9 \
librz-bin.so.0.9 \
librz-config.so.0.9 \
librz-cons.so.0.9 \
librz-core.so.0.9 \
librz-crypto.so.0.9 \
librz-debug.so.0.9 \
librz-egg.so.0.9 \
librz-flag.so.0.9 \
librz-hash.so.0.9 \
librz-io.so.0.9 \
librz-mark.so.0.9 \
librz-reg.so.0.9 \
librz-search.so.0.9 \
librz-sign.so.0.9 \
librz-socket.so.0.9 \
librz-syscall.so.0.9 \
librz-type.so.0.9 \
librz-util.so.0.9 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6"

inherit rpm
