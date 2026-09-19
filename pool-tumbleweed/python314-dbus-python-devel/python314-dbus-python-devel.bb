SUMMARY = "Python bindings for D-Bus -- development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains the development files for \
Python bindings for D-Bus."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python314-dbus-python-devel-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "21e014c35d3ee26057a0cb5a203cbff24c72e23513b400a58977d9ea416bcedc6ade1a031626543b41f1ee16e763c85da7799ac15366676edd0b09c84a7584a8"

RPROVIDES:${PN} += "dbus-1-python314-devel \
pkgconfig-dbus-python-3.14 \
python314-dbus-python-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
dbus-1-devel \
pkgconfig-dbus-1 \
python314-dbus-python \
python314-dbus-python-common-devel \
python314-devel"

inherit rpm
