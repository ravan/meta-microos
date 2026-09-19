SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-qt6pdf-6.11.0-2.2.aarch64.rpm"
RPM_HASH = "0c13123864f7b227007bcdb7dd4e2467b969825bd8027477ea730764c72bebfc4e45d94be8b731f91589a61ca00b4a4779603739021db831fd15f41de17a94b8"

RPROVIDES:${PN} += "python3-PyQt6-qt6pdf \
python313-PyQt6-qt6pdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Pdf.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python313-PyQt6 \
python313-PyQt6-sip \
python313-dbus-python"

inherit rpm
