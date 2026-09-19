SUMMARY = "Microsoft Azure Power BI Embedded Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Power BI Embedded Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-mgmt-powerbiembedded-3.0.0-1.9.noarch.rpm"
RPM_HASH = "7aec6b4265fd5965c572a58d6c5cffaa707ee61164fbc5493a6b339dc1a088c02f13a030bd86b61f9a9389497ecb79da24a62903b4d6386d8685153476945ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-powerbiembedded \
python3.13dist-azure-mgmt-powerbiembedded \
python313-azure-mgmt-powerbiembedded \
python3dist-azure-mgmt-powerbiembedded"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
