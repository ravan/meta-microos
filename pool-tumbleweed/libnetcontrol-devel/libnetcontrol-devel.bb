SUMMARY = "Development header and library files"
DESCRIPTION = "A interim network configuration library, currently implementing the \
libnetcf interface for libvirt. \
 \
The libnetcontrol-devel package contains libraries and header files \
required for development."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libnetcontrol-devel-0.3.2-4.9.aarch64.rpm"
RPM_HASH = "cfe0511a2c07dbc1e7de742ab9a70800737f1a05999fd86890c647c3570027dbacb90e88c5c2e6d75974686a5b922e439e9f066a2cf88f3725e1910b8857a7a2"

RPROVIDES:${PN} += "libnetcontrol-devel \
pkgconfig-netcontrol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetcontrol0"

inherit rpm
