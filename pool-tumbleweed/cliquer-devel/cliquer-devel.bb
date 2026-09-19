SUMMARY = "Development files for Cliquer"
DESCRIPTION = "Cliquer is a set of C routines for finding cliques in an arbitrary \
weighted graph and uses an exact branch-and-bound algorithm. \
 \
This subpackage provides the development headers for Cliquer's library."
LICENSE = "GPL-2.0-or-later"

PV = "1.23"

RPM_NAME = "cliquer-devel-1.23-1.5.aarch64.rpm"
RPM_HASH = "29c0da9555c5b5efc88722348fc751107c654bb430ab1865feeb4696251805a8f282bf1f53e1915b5e9f7f30d742da846dfd5fcd21ccf52699da0c9dda3df61f"

RPROVIDES:${PN} += "cliquer-devel \
pkgconfig-libcliquer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcliquer1"

inherit rpm
