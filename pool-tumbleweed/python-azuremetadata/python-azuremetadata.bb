SUMMARY = "Python module for collecting instance metadata from Azure"
DESCRIPTION = "A module for collecting instance metadata from Microsoft Azure."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.6"

RPM_NAME = "python-azuremetadata-5.1.6-1.4.noarch.rpm"
RPM_HASH = "9b0f2a9801ca7e12fd43e886fc5c63c3a9a0e25ea91e9b4034d16c320a47d197feee34398f83ac85fab44703451e07a464f707403b43fd44bfdc7f41f8ac8d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-azuremetadata \
python3.13dist-azuremetadata \
python3dist-azuremetadata"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
