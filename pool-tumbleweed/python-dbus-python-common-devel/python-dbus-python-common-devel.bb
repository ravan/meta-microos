SUMMARY = "Python bindings for D-Bus -- shared development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains development files shared between \
the Python2 and Python3 versions of the bindings."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python-dbus-python-common-devel-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "aa95f4eba88bee586d7795eef4f1afeb141901ad285f09c99f1bf2c1b29f12dc1d743010a12d72dbbb3c9d1e8d67fbe73b9f632731022dab87b4e08fe9b6cf7a"

RPROVIDES:${PN} += "pkgconfig-dbus-python \
python-dbus-python-common-devel \
python313-dbus-python-common-devel \
python314-dbus-python-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
pkgconfig-dbus-1 \
pkgconfig-dbus-glib-1"

inherit rpm
