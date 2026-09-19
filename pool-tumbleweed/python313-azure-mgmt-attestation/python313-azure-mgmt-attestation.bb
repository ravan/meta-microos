SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-attestation-2.0.0-1.2.noarch.rpm"
RPM_HASH = "2700ec182b55ea7c3432bee935eee30fc5a5b3846e2fce2e14962e106650872bee12e0071847e323b408da9a4dd7fae8add5469432a12a5df3cc98d1d98a4fd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-attestation \
python3.13dist-azure-mgmt-attestation \
python313-azure-mgmt-attestation \
python3dist-azure-mgmt-attestation"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
