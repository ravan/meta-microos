SUMMARY = "A custom ConfigParser class that preserves comments"
DESCRIPTION = "A custom ConfigParser class that preserves comments and most formatting when writing loaded config out."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-commented-configparser-3.0.0-2.2.noarch.rpm"
RPM_HASH = "139b3d05c4ec0c7d9b37e680c06a7938f0b9fb2028408994a60e52cb3ceeb9579c7f8c304e799631c84c23e8e04b3b46fad71848a15831d96c705dfcd9f76739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-commented-configparser \
python3.13dist-commented-configparser \
python313-commented-configparser \
python3dist-commented-configparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
