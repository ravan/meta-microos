SUMMARY = "Documentation for the libabw API"
DESCRIPTION = "This package contains documentation for the libabw API."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libabw-devel-doc-0.1.4-1.3.noarch.rpm"
RPM_HASH = "e3fbd1ec399e077c21958f82f2b6616808ecd82e541f03a65ea7827a16a0efe0cc377079a991043572b456d3109cdfece70edbc4c35d9220079d47102ba3413d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libabw-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
