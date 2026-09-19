SUMMARY = "Microsoft Azure App Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure App Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python314-azure-mgmt-app-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "c2092955178ace85d7541231791c68148a2e1eb526779dfe2fc5a1c9241f8ad686e15487f8f8add1b8d120520896ce369f4987970ef7539b435a04b94a5c767f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-app \
python314-azure-mgmt-app \
python3dist-azure-mgmt-app"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
