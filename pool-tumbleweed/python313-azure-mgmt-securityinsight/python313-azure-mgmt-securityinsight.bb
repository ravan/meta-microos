SUMMARY = "Microsoft Azure Security Insight Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Security Insight Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-securityinsight-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "61041594d2cecc7fad0a42d90845830254c09e638947b615a8981b5855e3d6c4c4346bb63067976fadacf4c57a685abe46039d06f5a3c3736369fb9f4e340a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-securityinsight \
python3.13dist-azure-mgmt-securityinsight \
python313-azure-mgmt-securityinsight \
python3dist-azure-mgmt-securityinsight"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.1 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
