SUMMARY = "Development files for the Qt5 QMQTT client library"
DESCRIPTION = "QMQTT is an MQTT client library for the Qt framework, speaking the MQTT 3.1 \
and 3.1.1 publish/subscribe protocols on top of QtNetwork. \
 \
This package contains the headers and the CMake package configuration needed \
to build Qt5 applications against QMQTT."
LICENSE = "EPL-1.0 | BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "qmqtt-qt5-devel-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "16a54bdec9304530efdbf0545d9946a40e5423a92ffcf0ba406d9e5c9a66c7627f6423d2b415e5b6d8cc211d4f88bbcec52546860ec7d387ed2f4e95558c7c9f"

RPROVIDES:${PN} += "cmake-qmqtt-qt5 \
qmqtt-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Network \
cmake-Qt5WebSockets \
libqmqtt-qt5-1"

inherit rpm
