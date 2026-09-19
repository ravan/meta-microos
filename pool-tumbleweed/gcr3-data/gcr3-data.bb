SUMMARY = "Data and icon set for gcr"
DESCRIPTION = "This package provides the GSettings schemas and a collection of icons \
needed by libgcr."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "gcr3-data-3.41.2-5.4.noarch.rpm"
RPM_HASH = "8a9926867ddadab27703fe09695fec47e23b3e517e000110387c94d3983b756a87ffe31cf1598cd949e6c8b45d56759bd80960fe4aa9639759fb8dc2dffd8db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcr-data \
gcr3-data"

RDEPENDS:${PN} += ""

inherit rpm
