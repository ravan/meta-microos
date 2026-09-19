SUMMARY = "Non-ABI stable API for the Qt 6 Mqtt library"
DESCRIPTION = "This package provides private headers of libQt6Mqtt that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-mqtt-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c7086bf261b20a6a894b2c069d78edc7dd9cecbb108b6461401935972664986774e13d96b11e1618dd0475ad98d3ba541ec83be86bc4f3fb98f6e61034de164d"

RPROVIDES:${PN} += "cmake-Qt6MqttPrivate \
qt6-mqtt-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Mqtt"

inherit rpm
