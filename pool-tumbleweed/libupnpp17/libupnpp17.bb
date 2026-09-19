SUMMARY = "Library providing a higher level C++ API over libnpupnp or libupnp"
DESCRIPTION = "Libupnpp is a C++ wrapper for libupnp a.k.a Portable UPnP (up to branch 0.17), \
or its C++ descendant, libnpupnp (versions 0.18 and later). \
 \
Libupnpp can be used to implement UPnP devices and services, or Control Points. \
The Control Point side of libupnpp, which is documented here, \
allows a C++ program to discover UPnP devices, and exchange commands and status with them."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libupnpp17-1.0.3-1.5.aarch64.rpm"
RPM_HASH = "049876f81bca1522b9203166eec66996e7648d604d9fefed4e9995ee4aa53708b63d6c15f482a3c19b0f4b353b7ac0dc7899101e3c254bcb4ffc5e144f75ae88"

RPROVIDES:${PN} += "libupnpp.so.17 \
libupnpp17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libnpupnp.so.13 \
libstdc++.so.6"

inherit rpm
