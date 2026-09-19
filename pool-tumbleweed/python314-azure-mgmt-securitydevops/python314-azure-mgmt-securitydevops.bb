SUMMARY = "Microsoft Azure Securitydevops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Securitydevops Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-mgmt-securitydevops-1.0.0~b2-2.9.noarch.rpm"
RPM_HASH = "60a96dcbffcda98bd908197c0d52dd75ebe4a9950bcdfa50c93721283edd549721fef83979827f080b7e03c3a175fbf22f9e78ff9ab4769dcd7a636f628b0a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-securitydevops \
python314-azure-mgmt-securitydevops \
python3dist-azure-mgmt-securitydevops"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
