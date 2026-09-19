SUMMARY = "CDDB Access Library"
DESCRIPTION = "Libcddb is a library that implements the different protocols (CDDBP, \
HTTP, and SMTP) to access data on a CDDB server (http://freedb.org). It \
tries to be as cross-platform as possible."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "libcddb-devel-1.3.2-30.5.aarch64.rpm"
RPM_HASH = "99156fb54de45d2e835de8d60ca1a13c564fd404e1408638e956c93bad94d6b4b4683990bc19799e3196a67c3df2c4cf0fca8f12b20c59c59ad2ce2660e9ae5f"

RPROVIDES:${PN} += "libcddb-devel \
pkgconfig-libcddb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcddb2"

inherit rpm
