SUMMARY = "Development files for k3b"
DESCRIPTION = "This package contain files needed for development with k3b."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "k3b-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "496234a77c8c513d995eb57948e9108a16f5e42329014e6148773da5a8fa6d2b0b170912ba4fee0589bbdcdc2be90678e3f3c9d5ac55bc6b0e02ff0a04828172"

RPROVIDES:${PN} += "k3b-devel"

RDEPENDS:${PN} += "k3b"

inherit rpm
