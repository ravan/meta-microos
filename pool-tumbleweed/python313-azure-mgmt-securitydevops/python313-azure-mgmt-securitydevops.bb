SUMMARY = "Microsoft Azure Securitydevops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Securitydevops Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-mgmt-securitydevops-1.0.0~b2-2.9.noarch.rpm"
RPM_HASH = "f275d28c2609a423103f757929d257fd82a17f3f979b832f7141468bafab03679d5130d9743dd792adbd6bc0d3bc7d409faf71be816e99cc382baa84aa9985a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-securitydevops \
python3.13dist-azure-mgmt-securitydevops \
python313-azure-mgmt-securitydevops \
python3dist-azure-mgmt-securitydevops"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
