SUMMARY = "Development files for the Distributed Multihead X extension library"
DESCRIPTION = "libdmx is an interface to the DMX extension for X, which allows a \
single server to be set up as a proxy spanning multiple servers -- \
not unlike Xinerama across discrete physical machines. It can be \
reconfigured on the fly to change the layout, and it is presented as \
a single logical display to clients. \
 \
This package contains the development headers for the library found \
in libdmx1."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libdmx-devel-1.1.5-1.11.aarch64.rpm"
RPM_HASH = "81533a94ce6807d8493b87c92c7cda396ff621885c73928cf41fd7418bbac04acbece94e31c874c480a99f071f00ded2c9a97c061ac658cf4a307684253f48df"

RPROVIDES:${PN} += "libdmx-devel \
pkgconfig-dmx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmx1 \
pkgconfig-dmxproto \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
