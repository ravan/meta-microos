SUMMARY = "Documentation package for librasqal-devel"
DESCRIPTION = "This package contains the documentation and help files to aid with \
developing software using the Rasqal RDF query language library."
LICENSE = "Apache-2.0+ | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.9.33"

RPM_NAME = "librasqal-devel-doc-0.9.33-3.5.aarch64.rpm"
RPM_HASH = "138c2f5a8b82ddec6cac7072ba6729f8f25455a072c474b04a18e081b21bad8dc5cf7a22f143028c7f2040495e10be7ab2504d9ff7cec9a8909377a62df8c5c0"

RPROVIDES:${PN} += "librasqal-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
