SUMMARY = "A language for matching/validating/filtering Python dictionaries"
DESCRIPTION = "The kmatch library provides a language for matching Python \
dictionaries. Patterns are specified as lists of filters combined \
with logical operators."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-kmatch-0.5.0-2.12.noarch.rpm"
RPM_HASH = "e6f5d7c382f27066e9a2efaec4b471e0b0bd0a953638b5b1b8a97f9fb409ebb3f91ab55e34a59c368bc98b72f755d46974cdcaf8f48c3c9121919cd74f4e2f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kmatch \
python3.13dist-kmatch \
python313-kmatch \
python3dist-kmatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
