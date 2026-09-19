SUMMARY = "An Enum that inherits from str"
DESCRIPTION = "An Enum that inherits from str."
LICENSE = "MIT"

PV = "0.4.15"

RPM_NAME = "python313-StrEnum-0.4.15-3.5.noarch.rpm"
RPM_HASH = "e5ec388052417eff6e403efb5e58d12022385ce7a1428d39189071869a2eb2e7ddb51fc28a206731607b37ef608e7835075cbecca4e848c91e14b13cede40053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-StrEnum \
python3.13dist-strenum \
python313-StrEnum \
python3dist-strenum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
