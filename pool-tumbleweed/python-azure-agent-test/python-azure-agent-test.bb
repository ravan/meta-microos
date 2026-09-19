SUMMARY = "Unit tests"
DESCRIPTION = "Unit tests for python-azure-agent."
LICENSE = "Apache-2.0"

PV = "2.14.0.1"

RPM_NAME = "python-azure-agent-test-2.14.0.1-2.1.noarch.rpm"
RPM_HASH = "86570e45008ca8b59d214e8d3da20d31660aa282850c5ce36938f80aace1598d9f9aa327c796ed8edcbda3ef845485623230fa8ac24ee6cdf1990f7b05df4438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-azure-agent-test"

RDEPENDS:${PN} += "/usr/bin/env \
openssl \
python-abi \
python-azure-agent \
python313-pytest"

inherit rpm
