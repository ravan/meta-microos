SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.17.0"

RPM_NAME = "python313-flake8-comprehensions-3.17.0-2.4.noarch.rpm"
RPM_HASH = "4cce8e4c62da850a203fb0307036f7d0fe3f89d13f7d4273c36b8f08ee6692a97157a35da5b49a50528039defe8293d110c46692bae1e97383d629b52ff934a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-comprehensions \
python3.13dist-flake8-comprehensions \
python313-flake8-comprehensions \
python3dist-flake8-comprehensions"

RDEPENDS:${PN} += "python-abi \
python313-flake8"

inherit rpm
