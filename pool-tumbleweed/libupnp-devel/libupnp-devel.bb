SUMMARY = "The Portable Universal Plug and Play (UPnP) SDK"
DESCRIPTION = "The Portable Universal Plug and Play (UPnP) SDK provides support for building \
UPnP-compliant control points, devices, and bridges on several operating \
systems."
LICENSE = "BSD-3-Clause"

PV = "22.1.0"

RPM_NAME = "libupnp-devel-22.1.0-1.1.aarch64.rpm"
RPM_HASH = "8e47bdbbe42502b2ccaa2a7c1eb0f13305a644a9dae5cec3c034bc064bf2b5c248b266df64e0f4928846d0b47e2b32ac94003dd53cb73bae8172073ecf261387"

RPROVIDES:${PN} += "cmake-UPNP \
libixml-devel \
libupnp-devel \
pkgconfig-libupnp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libixml22 \
libupnp22"

inherit rpm
