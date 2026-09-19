SUMMARY = "A library for creating and verifying challenges for ALTCHA"
DESCRIPTION = "The ALTCHA Python Library is a lightweight, zero-dependency library designed \
for creating and verifying [ALTCHA](https://altcha.org) challenges, \
specifically tailored for Python applications."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-altcha-2.1.0-1.1.noarch.rpm"
RPM_HASH = "4329ce20b7f6a785bc045aa47b5d6acae42197f303e59497d51607eca626da83a92691795cfeeaec497112d7ceec5709e5aef75320eb8eceec2988b6d6c32da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-altcha \
python314-altcha \
python3dist-altcha"

RDEPENDS:${PN} += "python-abi"

inherit rpm
