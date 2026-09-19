SUMMARY = "Development Files for HPI"
DESCRIPTION = "Contains additional files needed for a developer to create applications \
and/or middleware that use the Service Availability Forum's HPI \
specification."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-devel-3.8.0.ge4631e8a-3.20.aarch64.rpm"
RPM_HASH = "2c178155540ab936d793aa1c72482938cb6fc40b806d3398d2dd145944f55e6d808ff5ddfdbdd09985400288c3893ab0130c9266aaf2fd46bf40a32d084907e6"

RPROVIDES:${PN} += "openhpi-devel \
pkgconfig-openhpi \
pkgconfig-openhpiutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
OpenIPMI-devel \
bzip2 \
e2fsprogs-devel \
gdbm-devel \
glib2-devel \
glibc-devel \
libopenhpi4 \
libstdc++-devel \
libtool \
ncurses-devel \
net-snmp-devel \
pkgconfig-glib-2.0 \
pkgconfig-openssl \
popt-devel \
zlib-devel"

inherit rpm
