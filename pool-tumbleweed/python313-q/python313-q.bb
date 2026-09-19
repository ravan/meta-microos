SUMMARY = "Quick-and-dirty debugging output for tired programmers"
DESCRIPTION = "Quick-and-dirty debugging output for tired programmers."
LICENSE = "Apache-2.0"

PV = "2.7"

RPM_NAME = "python313-q-2.7-2.9.noarch.rpm"
RPM_HASH = "5cebce44dffc935f7699280d69833b9290815fb51cd68854abade8f0cc008f28908ea78d7a68694b814db7b32ea6edc774fc9e18278e7c7bd1471618ea8bec3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-q \
python3.13dist-q \
python313-q \
python3dist-q"

RDEPENDS:${PN} += "python-abi"

inherit rpm
