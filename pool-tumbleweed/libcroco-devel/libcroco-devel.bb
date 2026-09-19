SUMMARY = "CSS2 Parser Library Development Files"
DESCRIPTION = "Libcroco is a stand-alone CSS2 parsing library. It provides a low-level \
event-driven SAC-like API and a CSS object model like API."
LICENSE = "LGPL-2.1-only"

PV = "0.6.13"

RPM_NAME = "libcroco-devel-0.6.13-6.13.aarch64.rpm"
RPM_HASH = "1ab0c3c6be15743c688b8c227936faead34291f969fffa7396e2c67b3497962541ac92559200e7c2388c8b6cceee4fdd9d9c27e42e5018985314b0b87da3098f"

RPROVIDES:${PN} += "libcroco-devel \
pkgconfig-libcroco-0.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcroco \
libcroco-0-6-3 \
pkgconfig-glib-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
