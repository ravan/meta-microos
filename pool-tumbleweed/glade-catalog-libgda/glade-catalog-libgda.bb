SUMMARY = "Glade catalog for libgda"
DESCRIPTION = "This package provides a catalog for Glade, to allow the use the libgda \
widgets in Glade."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "glade-catalog-libgda-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "81aab1ce8b954d557e25b3970a7f2e7e0e1130ca03913ef7f82fd4548aa2b13f17ef0347b191fbbab6568075c4d72a195e64c2401e2ff64aa922688c4329dede"

RPROVIDES:${PN} += "glade-catalog-libgda"

RDEPENDS:${PN} += "glade \
libgda-6-0"

inherit rpm
