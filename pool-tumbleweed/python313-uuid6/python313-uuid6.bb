SUMMARY = "New time-based UUID formats which are suited for use as a database key"
DESCRIPTION = "New time-based UUID formats which are suited for use as a database key"
LICENSE = "MIT"

PV = "2025.0.1"

RPM_NAME = "python313-uuid6-2025.0.1-1.5.noarch.rpm"
RPM_HASH = "f62ba6a71dafee886d38c3708967719488f223f559235cb1a2e735bf76156b6da560bad45b358f7244b094f9b27c5ef979773e3c915b8629e0ae45bf7cec932c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uuid6 \
python3.13dist-uuid6 \
python313-uuid6 \
python3dist-uuid6"

RDEPENDS:${PN} += "python-abi"

inherit rpm
