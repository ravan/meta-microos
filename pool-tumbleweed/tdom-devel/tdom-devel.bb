SUMMARY = "Development Files for tdom"
DESCRIPTION = "This package contains files for developing software based on tdom."
LICENSE = "MPL-2.0"

PV = "0.9.6"

RPM_NAME = "tdom-devel-0.9.6-1.6.aarch64.rpm"
RPM_HASH = "dbc8274f5627c9ca21104d0db9b40fac8d59bfc77c9a14cf597e8a972f8f6a34e4f0e3baaeda771e539d310ac1a258f6cc02c0fead3683385efbe9fb364092ac"

RPROVIDES:${PN} += "tdom-devel"

RDEPENDS:${PN} += "tcl-devel \
tdom"

inherit rpm
