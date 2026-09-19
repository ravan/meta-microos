SUMMARY = "Library implementing the MQTT client"
DESCRIPTION = "The Paho MQTT C Client is a fully featured MQTT client written in ANSI standard C. \
C was chosen rather than C++ to maximize portability. A C++ API over this library is also available in Paho."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "1.3.16"

RPM_NAME = "libpaho-mqtt1-1.3.16-1.3.aarch64.rpm"
RPM_HASH = "6da8f4159990b0b906dbc144b32b688199978968e66232620ec418383ec6d317c83086892c2614e5e737ed17b6554d36a4a3df8f7576a3b74f8bf76a575a5b5a"

RPROVIDES:${PN} += "libpaho-mqtt1 \
libpaho-mqtt3a.so.1 \
libpaho-mqtt3as.so.1 \
libpaho-mqtt3c.so.1 \
libpaho-mqtt3cs.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
