SUMMARY = "Python diff wrapper"
DESCRIPTION = "Python diff wrapper."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-moreorless-0.6.0-1.2.noarch.rpm"
RPM_HASH = "3aeda01af1b3ddf48e6a838eef8ef08360f5441c3c8ff0bdf394f6a6799947c2c17e09a9122a726040102e969c0845c98cd45499b5b6c58e7404f6337852d7de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moreorless \
python3.13dist-moreorless \
python313-moreorless \
python3dist-moreorless"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
