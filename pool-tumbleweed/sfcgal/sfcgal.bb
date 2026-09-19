SUMMARY = "C++ wrapper library around CGAL"
DESCRIPTION = "This package contains tools & sample data to test libSFCGAL2."
LICENSE = "LGPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "sfcgal-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "e673a040918b3afb097aacf7b51ba3a3d114ea9629726438ccb56d3fa07a04d1ca22e2662dbe8aef92c6579ee4889b34e0e752a942dbeb0e0f1640c9d1025994"

RPROVIDES:${PN} += "sfcgal"

RDEPENDS:${PN} += ""

inherit rpm
