SUMMARY = "Python library to apply true color for terminal text"
DESCRIPTION = "A Python library to apply true color for terminal text."
LICENSE = "MIT"

PV = "0.1.7"

RPM_NAME = "python314-tcolorpy-0.1.7-1.7.noarch.rpm"
RPM_HASH = "6e7e0b33315516ce3e093aafcb780ff3b1de6809c471f0d0c2c3b8d0d9f4986576cb0399169a871a7e08b4dabebb4ef77b288f4f1564cde2bc8fbdf36e1663e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tcolorpy \
python314-tcolorpy \
python3dist-tcolorpy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
