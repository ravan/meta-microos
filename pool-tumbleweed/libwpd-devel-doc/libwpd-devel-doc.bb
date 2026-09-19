SUMMARY = "Documentation for the libwpd API"
DESCRIPTION = "This package contains documentation for the libwpd API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-devel-doc-0.10.3-3.19.noarch.rpm"
RPM_HASH = "e02762df2348a6df9b8dae1f0111329fec0c20f196e386c1f90596ef90e6912ccf7b93c30def1ce3c009ab254d997c33527a139246aac1a4c4ee129339e67097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwpd-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
