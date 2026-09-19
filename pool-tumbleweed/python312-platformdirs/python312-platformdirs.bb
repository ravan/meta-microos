SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "4.11.7"

RPM_NAME = "python312-platformdirs-4.11.7-1.1.noarch.rpm"
RPM_HASH = "6600b98b02d238f2c853f47c87cc98acf0420e9da39109f64651bf15176c08d2a97ce1bbab0b5f7ed1d4da27ce34cbde50a7f5f1772931752bc6698bcb9f487c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-platformdirs \
python312-platformdirs \
python3dist-platformdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
