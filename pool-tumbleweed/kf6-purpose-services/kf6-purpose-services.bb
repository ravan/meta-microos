SUMMARY = "Online services for purpose"
DESCRIPTION = "This package adds online services to kf6-purpose and are needed to connect to \
Google and Nextcloud servers."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-purpose-services-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "3711c03964a5ddc9c9c54a4d44cfeb5ddd03939e217be095da4c75b35ff76c1fa76e36e01724449e1a65a07cda4b87245576e5a893f467bc2f42731311f324ee"

RPROVIDES:${PN} += "kf6-purpose-services \
purpose-services"

RDEPENDS:${PN} += ""

inherit rpm
