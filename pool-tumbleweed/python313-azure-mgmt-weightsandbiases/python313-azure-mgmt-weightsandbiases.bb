SUMMARY = "Microsoft Azure Weightsandbiases Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Weightsandbiases Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-weightsandbiases-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "4c31b1821fbce62762acb3474a39945a89804279421dba313d11529d64e4336d3ea079cd61aa78ed1657055691e222eb688d4b167540c1605dd0eda8bec7b13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-weightsandbiases \
python3.13dist-azure-mgmt-weightsandbiases \
python313-azure-mgmt-weightsandbiases \
python3dist-azure-mgmt-weightsandbiases"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
