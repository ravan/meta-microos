SUMMARY = "Microsoft Azure Machine Learning Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-machinelearningservices-1.0.1-1.2.noarch.rpm"
RPM_HASH = "40030409af87d3c4da1c3329a3ff1fba67d7818323e74aa680594dea3ac7b2b67e1d2079fc1f373185aad6f651c567b77f98ee3062b7622e78c489c950d48f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-machinelearningservices \
python3.13dist-azure-mgmt-machinelearningservices \
python313-azure-mgmt-machinelearningservices \
python3dist-azure-mgmt-machinelearningservices"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
