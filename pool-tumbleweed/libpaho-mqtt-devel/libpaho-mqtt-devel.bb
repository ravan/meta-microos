SUMMARY = "Development files for MQTT C Client library"
DESCRIPTION = "Development files for the the Paho MQTT C Client."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "1.3.16"

RPM_NAME = "libpaho-mqtt-devel-1.3.16-1.3.aarch64.rpm"
RPM_HASH = "f1347a7e481e8aa5baaa39d8e7745a7287be17505f0eff53f738043a2fd39e4e80cf8923c9eace215222f5df3dc9523b0e9fb6454aa5daf09b96edce0aaea499"

RPROVIDES:${PN} += "cmake-eclipse-paho-mqtt-c \
libpaho-mqtt-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpaho-mqtt1"

inherit rpm
