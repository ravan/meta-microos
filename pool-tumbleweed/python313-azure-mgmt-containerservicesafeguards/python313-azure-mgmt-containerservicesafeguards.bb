SUMMARY = "Microsoft Azure Containerservicesafeguards Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Containerservicesafeguards Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-containerservicesafeguards-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "c6e10ca369d11ab326c5315abe3078c1c5dabc9780bad7a894f56b740dbe927b7234cae968025e0318f4b3e7d19b7ccb243aebdc788091821e197283cba84b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerservicesafeguards \
python3.13dist-azure-mgmt-containerservicesafeguards \
python313-azure-mgmt-containerservicesafeguards \
python3dist-azure-mgmt-containerservicesafeguards"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
