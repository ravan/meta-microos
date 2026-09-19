SUMMARY = "Qt 6 StateMachine library"
DESCRIPTION = "The Qt 6 StateMachine library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6StateMachine6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "fe0c210c7d0d45ba4a3efffa54ab9cde60426ebd2be194681ab5a5da71f6135245501ac5a28e4a0092c9650bec214053d7b2622ee0560a1596af0f875facdbea"

RPROVIDES:${PN} += "libQt6StateMachine.so.6 \
libQt6StateMachine6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
