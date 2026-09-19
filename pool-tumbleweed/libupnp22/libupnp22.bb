SUMMARY = "An implementation of Universal Plug and Play (UPnP)"
DESCRIPTION = "The Portable Universal Plug and Play (UPnP) SDK provides support for building \
UPnP-compliant control points, devices, and bridges on several operating \
systems"
LICENSE = "BSD-3-Clause"

PV = "22.1.0"

RPM_NAME = "libupnp22-22.1.0-1.1.aarch64.rpm"
RPM_HASH = "97f3b66ee01ff11f59caf11240cbdbd71a8f39f682fbcda0f234d55dd0a793ebfcceed5dde18246944baae97c2ae405dbcb74497ae24f2dca2f419bfd42db0d6"

RPROVIDES:${PN} += "libupnp.so.22 \
libupnp22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libixml.so.22"

inherit rpm
