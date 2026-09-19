SUMMARY = "Headers and documentation for libs3"
DESCRIPTION = "This library provides an API for using Amazon's S3 service. \
- access to all of S3's functionality \
- no requirement to know HTTP, XML or SSL \
- supports single-thread and multi-threaded operation in \
  synchronous and asynchronous fashion"
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "4.1.git277"

RPM_NAME = "libs3-devel-4.1.git277-1.27.aarch64.rpm"
RPM_HASH = "3b3c32d4781af62670cc9b328dfc05fb49acb1e7b39cc88a62cc06e5145f3bfd93aab228477b1a698310f1a5d0e229d297ab639540e347f512ed5bb63b32f17b"

RPROVIDES:${PN} += "libs3-devel"

RDEPENDS:${PN} += "libs3-4"

inherit rpm
