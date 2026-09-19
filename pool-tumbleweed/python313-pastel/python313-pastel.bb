SUMMARY = "String colorization for Python"
DESCRIPTION = "Pastel is a library to colorize strings in the terminal."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python313-pastel-0.2.1-3.5.noarch.rpm"
RPM_HASH = "d5ef51e174fe2b5e4e2daf6301cdec2545e14910480bd9303e066acddcc799ec07feed62a77eb65f4b18415a30548242ef155433512c6b1d749bf4f7f3ba3fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pastel \
python3.13dist-pastel \
python313-pastel \
python3dist-pastel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
