SUMMARY = "Development files for Guile Cairo bindings"
DESCRIPTION = "Files required to build software using Guile Cairo bindings."
LICENSE = "LGPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "guile-cairo-devel-1.11.2-1.13.aarch64.rpm"
RPM_HASH = "4d5d4d7bd40a7fbdf5b2449a27e026dc062fac25e0f8b95fb7d7bfa61ced4be8ff3b46a08758555a68ba877fdc18e8bd187da9603897341332af2a5ddfcd3e69"

RPROVIDES:${PN} += "guile-cairo-devel \
pkgconfig-guile-cairo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cairo-devel \
guile-cairo \
guile-devel \
pkgconfig-cairo \
pkgconfig-guile-3.0"

inherit rpm
