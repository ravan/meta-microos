SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-report-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "22eb88c2449005a75f8b98a13efa85a50a25f0069058982d7de5e8a23fc65000559a6a75a211a615dc4472dc3d70c85bce4a9c569c2cd394b77d176a1c20aade"

RPROVIDES:${PN} += "libgda-report"

RDEPENDS:${PN} += "/usr/bin/python3 \
libgda-report-6-0-6-0-0"

inherit rpm
