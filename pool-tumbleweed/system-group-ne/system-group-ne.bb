SUMMARY = "System group ne for AWS Nitro Enclaves"
DESCRIPTION = "System group ne for Nitro Enclaves."
LICENSE = "Apache-2.0"

PV = "1.5.0~git0.2950b36"

RPM_NAME = "system-group-ne-1.5.0~git0.2950b36-1.1.aarch64.rpm"
RPM_HASH = "37bedcafda26be9d518a4dcb16e414a8a66c20134c849f2fbd7c4cdddbe1dd0fd8235ec4fb1da095bff2e2ae66d89b0428bd744fffa9304d3c3572f711f22f3b"

RPROVIDES:${PN} += "group-ne \
system-group-ne"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
