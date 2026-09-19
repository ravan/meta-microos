SUMMARY = "Python module to convert voluptuous schemas to dictionaries"
DESCRIPTION = "A Python module to convert voluptuous schemas to dictionaries."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "python313-voluptuous-serialize-2.7.0-1.5.noarch.rpm"
RPM_HASH = "6d8b046e32525e1148d19b3b0e7c207dc23d86c09314bfa764300b9eb2a7de40de835d6f2e90a9f4dfd0cccdd95e4e8d1c4719eaf9f15380515bbd4d193372f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-voluptuous-serialize \
python3.13dist-voluptuous-serialize \
python313-voluptuous-serialize \
python3dist-voluptuous-serialize"

RDEPENDS:${PN} += "python-abi \
python313-voluptuous"

inherit rpm
