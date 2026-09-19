SUMMARY = "Documentation for Amarok"
DESCRIPTION = "This package provides documentation for the Amarok media player."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "amarok-doc-3.3.3-1.3.aarch64.rpm"
RPM_HASH = "83e4a728d45fd41b8dc8c27dc3afd51b134284c1edda52c55545614b11243df3e99a072c4ddbf85bd33514533bc63519be8c4babd0bb19c969578d73cc3ed123"

RPROVIDES:${PN} += "amarok-doc"

RDEPENDS:${PN} += ""

inherit rpm
