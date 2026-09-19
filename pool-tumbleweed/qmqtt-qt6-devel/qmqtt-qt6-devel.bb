SUMMARY = "Development files for the Qt6 QMQTT client library"
DESCRIPTION = "QMQTT is an MQTT client library for the Qt framework, speaking the MQTT 3.1 \
and 3.1.1 publish/subscribe protocols on top of QtNetwork. \
 \
This package contains the headers and the CMake package configuration needed \
to build Qt6 applications against QMQTT."
LICENSE = "EPL-1.0 | BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "qmqtt-qt6-devel-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "1e43446e274bb5896311aa20441d0f994870f0ce717abf49a999ffd302e83dbfbd29ac0ac295be530cb749ec4e5271e6d54d383fe3ab2c0cafd38eb30bd83785"

RPROVIDES:${PN} += "cmake-qmqtt-qt6 \
qmqtt-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Network \
cmake-Qt6WebSockets \
libqmqtt-qt6-1"

inherit rpm
