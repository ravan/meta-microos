SUMMARY = "Headers and sources for development with CLHEP Exceptions library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP Exceptions library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-Exceptions-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "1a74eccd5676476555dc1ef92b739c9319725f1ff336a15f71a158980467d49c68a12e77861f0a7dffe462253b7d695f1a21144f7ff1d73ebe0bfab1cf591444"

RPROVIDES:${PN} += "clhep-Exceptions-devel \
pkgconfig-clhep-exceptions"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libCLHEP-Exceptions-2-4-7-2 \
pkgconfig-clhep-cast \
pkgconfig-clhep-refcount"

inherit rpm
