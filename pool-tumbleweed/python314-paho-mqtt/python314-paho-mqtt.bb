SUMMARY = "MQTT version 3.11 client class"
DESCRIPTION = "This code provides a client class which enable applications to connect to an \
MQTT broker to publish messages, and to subscribe to topics and receive \
published messages. It also provides some helper functions to make publishing \
one off messages to an MQTT server very straightforward. \
 \
The MQTT protocol is a machine-to-machine (M2M)/'Internet of Things' \
connectivity protocol. Designed as an extremely lightweight publish/subscribe \
messaging transport, it is useful for connections with remote locations where \
a small code footprint is required and/or network bandwidth is at a premium. \
 \
Paho is an Eclipse Foundation project."
LICENSE = "EPL-1.0"

PV = "2.1.0"

RPM_NAME = "python314-paho-mqtt-2.1.0-2.7.noarch.rpm"
RPM_HASH = "dd8b96642e8b2cfa2c4e307a0b0e56884de0c529f34cb3704b892abc1c70aa0d5845e6bf95e46ac9d9bb9121ef7badb3bb4dcb06a2f82fab9cfc8c5664cde344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-paho-mqtt \
python314-paho-mqtt \
python3dist-paho-mqtt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
