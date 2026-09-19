SUMMARY = "Contains various CTL files"
DESCRIPTION = "This package contains various CTL files."
LICENSE = "AMPAS"

PV = "1.5.5"

RPM_NAME = "ctl-data-1.5.5-1.4.noarch.rpm"
RPM_HASH = "df699193940b8d53b2ed37ba1176a5113f47d4a59b04b8db853939556d6ccc4b938215247c2ccf9498b6cc77bf2ede2618302b2086651215638bf87074047b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ctl-data"

RDEPENDS:${PN} += ""

inherit rpm
