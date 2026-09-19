SUMMARY = "Microsoft Azure Cloudhealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cloudhealth Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python314-azure-mgmt-cloudhealth-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "29e20133b06d4103d8edb4d865a72e5bdc159d49df0e563d4f4988ff7e0485f54914505333560b20ea53eb615d22d639e9b4c67f9da4f2730bb1700d8d3c2c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-cloudhealth \
python314-azure-mgmt-cloudhealth \
python3dist-azure-mgmt-cloudhealth"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
