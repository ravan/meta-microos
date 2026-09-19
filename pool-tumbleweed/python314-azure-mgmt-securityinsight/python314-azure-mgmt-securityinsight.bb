SUMMARY = "Microsoft Azure Security Insight Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Security Insight Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-securityinsight-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "247e4e956a82a054b7ff8f879d0046b8afb4333037d4b5123fbe8854c6a015aa068d86ce567f1c52ea8c276887b8a5b98550897f04bd8c4df46d3c5e5fd94294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-securityinsight \
python314-azure-mgmt-securityinsight \
python3dist-azure-mgmt-securityinsight"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.1 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
