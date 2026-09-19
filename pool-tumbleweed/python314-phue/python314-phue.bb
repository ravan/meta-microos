SUMMARY = "Philips Hue Python library"
DESCRIPTION = "Full featured Python library to control the Philips Hue lighting system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python314-phue-1.1-3.5.noarch.rpm"
RPM_HASH = "1543572024864a87fa3064fe93033f4794150dd50852e486967c441cf7a29f39c87edca505220d789841f6aa7a7dc90f48d9144808ea90fa0151b4b36ce1ffab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-phue \
python314-phue \
python3dist-phue"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
python-abi"

inherit rpm
