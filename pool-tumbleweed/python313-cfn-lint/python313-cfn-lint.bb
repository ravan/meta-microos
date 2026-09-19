SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "1.55.1"

RPM_NAME = "python313-cfn-lint-1.55.1-1.1.noarch.rpm"
RPM_HASH = "6c5b8b8f896dcf5982bf84bc3d1fa0017d1557c45dfe7a2e8c620336b1153a5d3e16b047448964e9ec415304819023f2c217b91c2bd67caf28ffc608c4d7eee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfn-lint \
python3-cfn-lint \
python3.13dist-cfn-lint \
python313-cfn-lint \
python3dist-cfn-lint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
git-core \
python-abi \
python313-PyYAML \
python313-jsonpatch \
python313-networkx \
python313-regex \
python313-sympy \
python313-typing-extensions \
update-alternatives"

inherit rpm
