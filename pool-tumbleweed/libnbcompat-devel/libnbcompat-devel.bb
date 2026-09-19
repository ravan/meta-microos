SUMMARY = "Development files for libnbcompat"
DESCRIPTION = "This package holds the development files for libnbcompat. \
 \
libnbcompat is a NetBSD compatibility library that supplies routines used by NetBSD \
bootstrap tools that are missing on other operating systems."
LICENSE = "BSD-4-Clause"

PV = "1.0.1"

RPM_NAME = "libnbcompat-devel-1.0.1-3.12.aarch64.rpm"
RPM_HASH = "699de90f3bbe80ed35867367d45d3172fa74cd6fc95094c6227c42ed0c16b3b6d39a9d332c51eef87efa15df7e8a737c360f6d334a59d4caa81b8d24af94c888"

RPROVIDES:${PN} += "libnbcompat-devel"

RDEPENDS:${PN} += "libnbcompat0"

inherit rpm
