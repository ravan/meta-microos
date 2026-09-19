SUMMARY = "Manipulate datetime objects relative to time zones"
DESCRIPTION = "Python helpers for manipulating datetime objects relative to time zones."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python314-fleming-0.7.0-2.10.noarch.rpm"
RPM_HASH = "ffe43c94eebfcc6be835a61761b94d7c23cd2e57c7b02b21813c5b647847e4e0cf2ab23d2f61376fa22da3f704f3c4a8290445e9097659d091bd1340045bf80d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fleming \
python314-fleming \
python3dist-fleming"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil \
python314-pytz"

inherit rpm
