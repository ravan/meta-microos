SUMMARY = "Python sunset and sunrise time calculation"
DESCRIPTION = "Python sunset and sunrise time calculation library."
LICENSE = "LGPL-3.0-only"

PV = "1.3.2"

RPM_NAME = "python314-suntime-1.3.2-1.10.noarch.rpm"
RPM_HASH = "73a9ccb9b871f2f602413c8409dc623bf9113c7213f51cb7a76668deff27f314c69f3938378eb20f2dd0207400d7985066696489ff64768f5c7156fdacbfe82e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-suntime \
python314-suntime \
python3dist-suntime"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil"

inherit rpm
