SUMMARY = "Development files for clthreads"
DESCRIPTION = "Development files for clthreads including headers and libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.2"

RPM_NAME = "clthreads-devel-2.4.2-3.9.aarch64.rpm"
RPM_HASH = "02322fe333259cec9f3d7b812dee43887cb9c3c4bf718dcf1be2851ca50e929a2c918e87c5fee6d690ccf4ed8241bc83578199fd3a85ffcc470645f05c245664"

RPROVIDES:${PN} += "clthreads-devel"

RDEPENDS:${PN} += "libclthreads2"

inherit rpm
