SUMMARY = "Chinese Lunar calendar library Documents"
DESCRIPTION = "Documents for Chinese Lunar calendar library"
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "lunar-date-doc-3.0.1-1.13.noarch.rpm"
RPM_HASH = "72db47ad6422dba2d81e7fe702e61f46e64b9b9cb7a74dc54654fb671b0810be8cb667706550660aedcf35bf5a8c47b7daceb86ca9bcf7105be1a9baac14042b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lunar-date-doc"

RDEPENDS:${PN} += ""

inherit rpm
