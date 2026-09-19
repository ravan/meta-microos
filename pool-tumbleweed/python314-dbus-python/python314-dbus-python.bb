SUMMARY = "Python bindings for D-Bus"
DESCRIPTION = "D-Bus python bindings for use with python programs."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python314-dbus-python-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "111168d48bb99b396ee08653c6076473568f3d87f6f2d917ebec849ef592e01c34c3351a9c02055c441cab5f0d36cdf37ff3d6e31a6b4ebe307250a8093f1174"

RPROVIDES:${PN} += "dbus-1-python314 \
python314-dbus-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
python-abi \
python314-gobject \
python314-xml"

inherit rpm
