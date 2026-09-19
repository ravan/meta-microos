SUMMARY = "Qt 6 Mqtt library - Development files"
DESCRIPTION = "Development files for the Qt 6 Mqtt library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-mqtt-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9dfca4eedbc997feb4c7a2aa452924244f175ac4f05847ef944badfccc5582e950672b189e377cf63b133bf8072181b736a5cdd401ee0b64ab127c8ec9739650"

RPROVIDES:${PN} += "cmake-Qt6Mqtt \
pkgconfig-Qt6Mqtt \
qt6-mqtt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6Mqtt6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6WebSockets"

inherit rpm
