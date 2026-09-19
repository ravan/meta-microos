SUMMARY = "Module to diff JSON and JSON-like structures in Python"
DESCRIPTION = "Package to show differences between JSON and JSON-like structures in Python"
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python314-jsondiff-2.2.1-3.6.noarch.rpm"
RPM_HASH = "b51e19251ea43f89a48018181c4c839a0de8f72ec016d2136276d8b254dd7fb0768df9c65ebbec5e43f3398c017a9da2debe198899f232abadea2acf31a34833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsondiff \
python314-jsondiff \
python3dist-jsondiff"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML"

inherit rpm
