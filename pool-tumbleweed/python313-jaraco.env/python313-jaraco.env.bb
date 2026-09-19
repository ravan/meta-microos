SUMMARY = "Facilities for environment variables"
DESCRIPTION = "Facilities for environment variables"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-jaraco.env-1.0.0-1.4.noarch.rpm"
RPM_HASH = "1dd382ad3cbd79d9ab076bc3bf70d991a7361e14c610224781086f6cffc64f726ce33578fd52dbcde066df791060357ef489e83a4e1c2a07b3309e8d96c7bd42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.env \
python3.13dist-jaraco.env \
python313-jaraco.env \
python3dist-jaraco.env"

RDEPENDS:${PN} += "python-abi"

inherit rpm
