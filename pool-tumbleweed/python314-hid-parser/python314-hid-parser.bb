SUMMARY = "Parse HID report descriptors"
DESCRIPTION = "Typed pure Python library to parse HID report descriptors"
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python314-hid-parser-0.1.0-1.2.noarch.rpm"
RPM_HASH = "a8fdd8954af94fcb14d13c08beafeb135c95df47a19bff94f4c563c1fe7a13c5c778462c411dec4a3cb13b46582f49c458582c4fb3f1b996df8830d57f254906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hid-parser \
python314-hid-parser \
python3dist-hid-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
