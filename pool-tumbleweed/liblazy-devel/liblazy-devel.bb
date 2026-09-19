SUMMARY = "Liblazy - D-Bus methods provided for convenience"
DESCRIPTION = "Liblazy is a simple and easy to use library that provides convenient \
functions for sending messages over the D-Bus daemon, querying \
information from HAL or asking PolicyKit for a privilege."
LICENSE = "LGPL-2.1+"

PV = "0.2"

RPM_NAME = "liblazy-devel-0.2-1.36.aarch64.rpm"
RPM_HASH = "f1a69894b7a664169d704c1c6bed1b9779ece41b9dc1bc67e190b821600e11dc043d44f77e358343cd3067bf3b5aa7045f089f732053b5e94b2cfff29ebd9a46"

RPROVIDES:${PN} += "liblazy-devel \
pkgconfig-lazy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
liblazy1 \
pkgconfig-dbus-1"

inherit rpm
