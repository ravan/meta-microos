SUMMARY = "Module to diff JSON and JSON-like structures in Python"
DESCRIPTION = "Package to show differences between JSON and JSON-like structures in Python"
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python313-jsondiff-2.2.1-3.6.noarch.rpm"
RPM_HASH = "2db4f6e66744251d07b46469381d9897290ee1f7a6653c5c180d0327cd7ca5dc65f1a9de0b94a32114ac99624b0c938b5a359b2ea4ae2fc471568ecaf22b3fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsondiff \
python3.13dist-jsondiff \
python313-jsondiff \
python3dist-jsondiff"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML"

inherit rpm
