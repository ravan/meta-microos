SUMMARY = "Shared ruamel routines"
DESCRIPTION = "This is a common package for the 'ruamel' namespace."
LICENSE = "MIT"

PV = "1.0.0+post1"

RPM_NAME = "python313-ruamel.base-1.0.0+post1-3.5.noarch.rpm"
RPM_HASH = "fb3406c3cf9f9e42f30d0b58792cb7a19bf08ecef120ac815f180ccc45fb233d1f3e4fbfce10283954d9578ef7212888c86f30c4cf08e0a849557d98223fbc36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.base \
python3.13dist-ruamel.base \
python313-ruamel.base \
python3dist-ruamel.base"

RDEPENDS:${PN} += "python-abi"

inherit rpm
