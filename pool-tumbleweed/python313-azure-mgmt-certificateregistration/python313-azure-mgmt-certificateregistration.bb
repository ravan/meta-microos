SUMMARY = "Microsoft Azure Certificateregistration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Certificateregistration Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-certificateregistration-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "f0d1f40ab5f3008cd59a523223e86173d7a5b2fada25dd0517c2e68b601a3f8cdc933a7c353b161067782a77ceda30dd4a25236da8cb526bee51696669b50c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-certificateregistration \
python3.13dist-azure-mgmt-certificateregistration \
python313-azure-mgmt-certificateregistration \
python3dist-azure-mgmt-certificateregistration"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
