SUMMARY = "API for ssdeep"
DESCRIPTION = "Devel API for ssdeep, the primary library is libfuzzy.*"
LICENSE = "GPL-2.0 & GPL-2.0+"

PV = "2.14.1"

RPM_NAME = "libfuzzy-devel-2.14.1-1.34.aarch64.rpm"
RPM_HASH = "95f1ee901b01aa9bf05b8845bb304bededcc6c301fcdc8b259e527496f9f253e3c125709f6db2ced7f3e365f00e2b4fcf6631c1c5acca5f5d4360aa125a2e4fc"

RPROVIDES:${PN} += "libfuzzy-devel"

RDEPENDS:${PN} += "libfuzzy2"

inherit rpm
