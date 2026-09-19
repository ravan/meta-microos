SUMMARY = "Manual for junit"
DESCRIPTION = "Documentation for junit."
LICENSE = "EPL-1.0"

PV = "4.13.2"

RPM_NAME = "junit-manual-4.13.2-8.9.noarch.rpm"
RPM_HASH = "90a6e5c3c33e195356ab17eb364898af8529bc844bedc712b3e3ce71709bc21a73892c4712d8b870fce3db171f7dfe08eb005f31c6bcb185311a82fddf980518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit-manual \
junit4-manual"

RDEPENDS:${PN} += ""

inherit rpm
