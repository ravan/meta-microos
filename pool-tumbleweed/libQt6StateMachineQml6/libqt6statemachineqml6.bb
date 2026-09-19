SUMMARY = "Qt 6 StateMachineQml library"
DESCRIPTION = "The Qt 6 StateMachineQml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6StateMachineQml6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ed23e720ca8012924b041ef135110716806e8fa6e8eddb155ddf15cdac36b1b1a15bc7cc9c8b9e69668643018805dd7a7a81cc2aab5015734dc3c96e077825a2"

RPROVIDES:${PN} += "libQt6StateMachineQml.so.6 \
libQt6StateMachineQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6StateMachine.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
