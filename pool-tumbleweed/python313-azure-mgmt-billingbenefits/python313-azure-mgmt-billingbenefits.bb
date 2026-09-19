SUMMARY = "Microsoft Azure Billingbenefits Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Billingbenefits Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-mgmt-billingbenefits-1.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "85422415cbb7711bbc9c0ca1e9715ae248bc1b46a29e162a3aa42c7ac9f0c6ba38dc8c4f173a4b9ab3648458319b42ee74e81619b0a1900aaa390fc190b9fedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-billingbenefits \
python3.13dist-azure-mgmt-billingbenefits \
python313-azure-mgmt-billingbenefits \
python3dist-azure-mgmt-billingbenefits"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
