SUMMARY = "A custom ConfigParser class that preserves comments"
DESCRIPTION = "A custom ConfigParser class that preserves comments and most formatting when writing loaded config out."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-commented-configparser-3.0.0-2.2.noarch.rpm"
RPM_HASH = "515a8d00c51874f5efda08f3db76e59ea1429227fe3f9ac3937fd2b2b9659eb73f12f20132c5f1e6a2f669a2980fba4637a140bb9be718221bfd58d5c5b79b69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-commented-configparser \
python314-commented-configparser \
python3dist-commented-configparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
