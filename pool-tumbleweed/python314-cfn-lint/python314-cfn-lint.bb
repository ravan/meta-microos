SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "1.55.1"

RPM_NAME = "python314-cfn-lint-1.55.1-1.1.noarch.rpm"
RPM_HASH = "469aad77eccabfd7dd251bc7516d7932d2ac23acbaf16431090ca3e382e9427269e3b970cba729483777b9ae4f35b8e8e5a56689ac96965a16fc74a97b339544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfn-lint \
python3.14dist-cfn-lint \
python314-cfn-lint \
python3dist-cfn-lint"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
git-core \
python-abi \
python314-PyYAML \
python314-jsonpatch \
python314-networkx \
python314-regex \
python314-sympy \
python314-typing-extensions \
update-alternatives"

inherit rpm
