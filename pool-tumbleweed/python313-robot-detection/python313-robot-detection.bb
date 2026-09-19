SUMMARY = "HTTP User Agent Bot Detection"
DESCRIPTION = "Library for detecting if a HTTP User Agent header is likely to be a bot."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "python313-robot-detection-0.4.0-5.5.noarch.rpm"
RPM_HASH = "026f57bbfbbbad0f5191c9b09ac5313aeb3742e80dd214230d2e8863a8128284e9e3fbf5ef30a4e8f7b106cc6215078c4333d6b55f67f6de667a7ba6a5e7426b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-robot-detection \
python3.13dist-robot-detection \
python313-robot-detection \
python3dist-robot-detection"

RDEPENDS:${PN} += "python-abi"

inherit rpm
