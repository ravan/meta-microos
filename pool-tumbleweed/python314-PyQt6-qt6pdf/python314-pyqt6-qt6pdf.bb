SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-qt6pdf-6.11.0-2.2.aarch64.rpm"
RPM_HASH = "abfb656c0d8d5acfb27924a99cf3b819f0080f411e2195ac0ae5f183ff612f9625c1577836397d1ae6b5626dafd473109953f5fcf0b0164ffb015ce8dc9782ed"

RPROVIDES:${PN} += "python314-PyQt6-qt6pdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Pdf.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python314-PyQt6 \
python314-PyQt6-sip \
python314-dbus-python"

inherit rpm
