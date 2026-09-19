SUMMARY = "Microsoft Azure Cloudhealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cloudhealth Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python313-azure-mgmt-cloudhealth-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "54a0d605a64567e5f1930ca7829d5249afd7872886c091f29f1f10cd5317f96a303ed3fef630b368894b922273e9bdd35a6f563294ef0cb74d256f3badfe749b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cloudhealth \
python3.13dist-azure-mgmt-cloudhealth \
python313-azure-mgmt-cloudhealth \
python3dist-azure-mgmt-cloudhealth"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
