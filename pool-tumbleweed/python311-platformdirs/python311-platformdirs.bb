SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "4.11.7"

RPM_NAME = "python311-platformdirs-4.11.7-1.1.noarch.rpm"
RPM_HASH = "372e7f68dd82186eff44d9b0b0a970e87a31f8e6b1dcafe71328bb72088c29a1ecf6936b4d9df201d1e75d05b41373063b5a5dcebc22faadabe27a5778a54ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-platformdirs \
python311-platformdirs \
python3dist-platformdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
