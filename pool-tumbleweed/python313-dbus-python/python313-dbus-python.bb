SUMMARY = "Python bindings for D-Bus"
DESCRIPTION = "D-Bus python bindings for use with python programs."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python313-dbus-python-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "3417b651dc506010ba34fae3f7d97ffec70f65a5eb7d112d0eedf8c79f92ad8d9bb1d82a1462c0fa534b8a12b94643de1be94363ff4a25ee53fec38512422dd5"

RPROVIDES:${PN} += "dbus-1-python3 \
dbus-1-python313 \
python3-dbus-python \
python313-dbus-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
python-abi \
python313-gobject \
python313-xml"

inherit rpm
