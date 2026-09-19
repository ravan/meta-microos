SUMMARY = "Development files for python313-shiboken6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "(GPL-2.0-only & (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0) | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "python313-shiboken6-devel-6.11.2-1.2.aarch64.rpm"
RPM_HASH = "d5308df1e2d4c7b1b69bafed4f5cef5e63a10cb1579656db5ca3c0808bf3551dfa344203a0736b34135e7a8540a104a9397d495a809d659f3f7e1939f7444bcf"

RPROVIDES:${PN} += "cmake-Shiboken6 \
cmake-Shiboken6Tools \
pkgconfig-shiboken6 \
python3-shiboken6-devel \
python313-shiboken6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
llvm23-devel \
python313-shiboken6"

inherit rpm
