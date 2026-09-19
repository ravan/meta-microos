SUMMARY = "Tools for testing of various Bluetooth-functions"
DESCRIPTION = "Contains a few tools for testing various bluetooth functions. The \
BLUETOOTH trademarks are owned by Bluetooth SIG, Inc., U.S.A."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.82"

RPM_NAME = "bluez-test-5.82-2.4.aarch64.rpm"
RPM_HASH = "699904e1050de3cabdf7045bf5337247687a7ff41634877d089d67760607651f9167ca75bed9443e67526330d6390eefafad08798824223f82098d63d13021f1"

RPROVIDES:${PN} += "bluez-test"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python3-dbus-python \
python3-gobject"

inherit rpm
