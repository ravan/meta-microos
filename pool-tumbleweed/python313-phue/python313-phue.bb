SUMMARY = "Philips Hue Python library"
DESCRIPTION = "Full featured Python library to control the Philips Hue lighting system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python313-phue-1.1-3.5.noarch.rpm"
RPM_HASH = "361a41a129158c44ef7ff1d723c5a8c90b60f56abb9b1b4b3e30ebc98291a69d7fbe54a7c8a3c6de7963dc80acf6eae2d7825ffcf44b519a77533c71eac01dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phue \
python3.13dist-phue \
python313-phue \
python3dist-phue"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
