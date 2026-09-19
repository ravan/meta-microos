SUMMARY = "Wayland-native display configuration for Budgie"
DESCRIPTION = "Budgie Desktop Services is the future central hub and orchestrator for Budgie Desktop (with a focus on Budgie 11). \
Today, it primarily provides Wayland-native display configuration for Budgie 10.10; over time it will coordinate broader desktop logic for Budgie 11."
LICENSE = "MPL-2.0"

PV = "1.0.2+0"

RPM_NAME = "budgie-desktop-services-1.0.2+0-1.2.aarch64.rpm"
RPM_HASH = "06e781a0fd49b5b70470f6eec789ea25628fe158c85dc49a2b7e7085cc72854d3266bff372f467fdecd6ccfb87b011fb9f8740305abf66e3f9eb75632915f8ea"

RPROVIDES:${PN} += "budgie-desktop-services"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKWaylandClient.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
