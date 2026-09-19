SUMMARY = "Development files for the Osmo ISDN utility library"
DESCRIPTION = "The libosmocore library contains various utility functions, a \
collection of common code used in various ISDN related sub-projects \
inside the Osmocom family of projects. It includes an I.460 \
sub-channel multiplex and a generic LAPD core."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmoisdn-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "511784ac4726b4b3df1bcedfe82e5525796036aa42177032cf1852a926de775b14d3111c0584b118ac5a63065d2ef4b0b2f51d09adbc4853c0a76e9afd868101"

RPROVIDES:${PN} += "libosmoisdn-devel \
pkgconfig-libosmoisdn"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-libosmocore \
pkgconfig-talloc"

inherit rpm
