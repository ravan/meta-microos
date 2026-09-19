SUMMARY = "Configuration files for persistent reservation helper"
DESCRIPTION = "The pr-helper-conf package provides configuration files for persistent \
reservation helper"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-pr-helper-conf-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "3c05eebd275bc63704b1fad54de2cbcee7fafa2292d7dcc44d2f0d3bc7aa13cdb70d1532cdcd29da2923d78d6a2810f74ea16c59695df6706cd41e183f8e8729"

RPROVIDES:${PN} += "kubevirt-pr-helper-conf \
kubevirt1.9-pr-helper-conf"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
