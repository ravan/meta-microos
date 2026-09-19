SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.17.0"

RPM_NAME = "python314-flake8-comprehensions-3.17.0-2.4.noarch.rpm"
RPM_HASH = "9aff8deb7966d146099ed63080da03bbbc9695b2981722a628023cf97c2dce904f452f4ba9fcae2ebc4637a4ef2bd60ed84a0cd7b409ecb329f7e0ecd6328c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-comprehensions \
python314-flake8-comprehensions \
python3dist-flake8-comprehensions"

RDEPENDS:${PN} += "python-abi \
python314-flake8"

inherit rpm
