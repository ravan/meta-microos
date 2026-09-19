SUMMARY = "Parse HID report descriptors"
DESCRIPTION = "Typed pure Python library to parse HID report descriptors"
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python313-hid-parser-0.1.0-1.2.noarch.rpm"
RPM_HASH = "a1ee0bfb8c78e939fa90b4c50e12089671f8c840112726fa237f1035b6b032491298de56e4e270337871f0104596e8e2bcca957153c5e105b51116b2d69fe68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hid-parser \
python3.13dist-hid-parser \
python313-hid-parser \
python3dist-hid-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
