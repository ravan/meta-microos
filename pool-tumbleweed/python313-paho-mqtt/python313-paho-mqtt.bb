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

RPM_NAME = "python313-paho-mqtt-2.1.0-2.7.noarch.rpm"
RPM_HASH = "d02aa5781d212b83833a936bdf47944829ef841651628a1a3e6dc8354945cbca3bd394f830230d9208d876ce4d787ca81861c83190bad6f9971c6e8fb5935e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paho-mqtt \
python3.13dist-paho-mqtt \
python313-paho-mqtt \
python3dist-paho-mqtt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
