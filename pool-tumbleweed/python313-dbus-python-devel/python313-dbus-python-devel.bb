SUMMARY = "Python bindings for D-Bus -- development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains the development files for \
Python bindings for D-Bus."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python313-dbus-python-devel-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "e422deeaa5333ad52f1cb9bfed4f61d511fd911f08acca62fb14e191f98c491a395c0435b31f10dc829dac58857bc649283080c71cacd12a92949609c1a0b579"

RPROVIDES:${PN} += "dbus-1-python3-devel \
dbus-1-python313-devel \
pkgconfig-dbus-python-3.13 \
python3-dbus-python-devel \
python313-dbus-python-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
dbus-1-devel \
pkgconfig-dbus-1 \
python313-dbus-python \
python313-dbus-python-common-devel \
python313-devel"

inherit rpm
