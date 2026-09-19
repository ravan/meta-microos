SUMMARY = "Plugin script for tukit"
DESCRIPTION = "Plugin scripts for tukit to handle BLS config files"
LICENSE = "MIT"

PV = "1+git20260909.7cfa1f0"

RPM_NAME = "sdbootutil-tukit-1+git20260909.7cfa1f0-1.1.noarch.rpm"
RPM_HASH = "6e763da25d3787ca4447e27006d20a8176794713ee2430705082b9805f37a92032d18cec4bcd60ffc0573729ccd2a02ae3168308c0f7e5c41d0cb55e6bd4382d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbootutil-tukit"

RDEPENDS:${PN} += "/usr/bin/bash \
sdbootutil \
tukit"

inherit rpm
