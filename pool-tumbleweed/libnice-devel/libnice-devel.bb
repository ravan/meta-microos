SUMMARY = "Development files for libnice, an implemtation of ICE"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.23"

RPM_NAME = "libnice-devel-0.1.23-2.3.aarch64.rpm"
RPM_HASH = "b1581d4674363c4026632c71606382b943389d808727f22d678c559d98552360a5cdd275d303fb699557f977e5eb84926cc6c7b7f03d2d3a515996f3f89f450f"

RPROVIDES:${PN} += "libnice-devel \
libnice-doc \
pkgconfig-nice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnice10 \
pkgconfig-gio-2.0 \
pkgconfig-gnutls \
pkgconfig-gthread-2.0 \
pkgconfig-gupnp-igd-1.6 \
typelib-1-0-Nice-0-1"

inherit rpm
