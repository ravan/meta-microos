SUMMARY = "Library to handle UPnP IGD port mapping - Development Files"
DESCRIPTION = "GUPnP-IGD is a library to handle UPnP IGD port mapping. It is supposed \
to have a very simple API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "libgupnp-igd-devel-1.6.0-2.13.aarch64.rpm"
RPM_HASH = "da977fb50fb55b63834725d8fca6c8b1f2ba6637f4dec1f433534bb73b1391f4f6da8ebac4d2b40a7b17151f0d2ac115edab14457700d8e1a09d7117bd03c896"

RPROVIDES:${PN} += "libgupnp-igd-devel \
pkgconfig-gupnp-igd-1.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgupnp-igd-1-6-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gssdp-1.6 \
pkgconfig-gthread-2.0 \
pkgconfig-gupnp-1.6 \
typelib-1-0-GUPnPIgd-1-6"

inherit rpm
