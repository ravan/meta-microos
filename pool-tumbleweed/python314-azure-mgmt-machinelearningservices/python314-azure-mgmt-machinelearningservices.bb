SUMMARY = "Microsoft Azure Machine Learning Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-machinelearningservices-1.0.1-1.2.noarch.rpm"
RPM_HASH = "6194dc2f415a5a68d8e91170ee500c6658e287c7c80fa9a6f2d672d7e497c39b3c8ad67e95e402d11aabef48f84164a72ff5e9736cdc3e5ee58d4ea5bb1e5fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-machinelearningservices \
python314-azure-mgmt-machinelearningservices \
python3dist-azure-mgmt-machinelearningservices"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
