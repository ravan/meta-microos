SUMMARY = "Documentation and Headers for chmlib"
DESCRIPTION = "This package contains the headers and documentation for the chmlib API \
that programmers will need to develop applications which use chmlib, \
the software library for dealing with Microsoft ITSS/CHM format files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40"

RPM_NAME = "chmlib-devel-0.40-26.5.aarch64.rpm"
RPM_HASH = "999b94341cf03eb737da7d93c0f740a49444999dc414ed502846b7eb130b8a390b897bebba9faf45bec9ea5f823b404cad999c680156922f731cfdf59c0f7fa2"

RPROVIDES:${PN} += "chmlib-devel"

RDEPENDS:${PN} += "libchm0"

inherit rpm
