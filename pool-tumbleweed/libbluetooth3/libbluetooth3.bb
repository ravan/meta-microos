SUMMARY = "Bluetooth Libraries"
DESCRIPTION = "BlueZ provides support for the core Bluetooth layers and protocols. \
It is uses a modular implementation. It has many interesting features: \
 \
* Multithreaded data processing \
* Support for multiple Bluetooth devices \
* Real hardware abstraction \
* Standard socket interface to all layers \
* Device and service level security support"
LICENSE = "GPL-2.0-or-later"

PV = "5.82"

RPM_NAME = "libbluetooth3-5.82-2.4.aarch64.rpm"
RPM_HASH = "89cb8ab684c27ee8672a306bbc90023f9a8a554354a7f254e14cf2c27f9c88adf7387e30fdb2a704ee6cadf8f3ea670b8e38189287d5082b5b49e28b7e240b02"

RPROVIDES:${PN} += "bluez-libs \
libbluetooth.so.3 \
libbluetooth3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
