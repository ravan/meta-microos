SUMMARY = "Development package for the Rasqal RDF query library"
DESCRIPTION = "This package contains the files needed to develop with the Rasqal RDF \
query language library."
LICENSE = "Apache-2.0+ | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.9.33"

RPM_NAME = "librasqal-devel-0.9.33-3.5.aarch64.rpm"
RPM_HASH = "af53c2ed01034b2a96ab03afa1b2517eb624723cd4debccdb2656150a2bf69e4a8215dac6ae8818c2a2bab1802ea6858a9c58d3b6733287452485d0c0b593299"

RPROVIDES:${PN} += "librasqal-devel \
pkgconfig-rasqal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libraptor-devel \
librasqal3 \
pkgconfig-raptor2"

inherit rpm
