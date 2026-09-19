SUMMARY = "Microsoft Azure Machine Learning Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python314-azure-mgmt-machinelearningcompute-0.4.1-6.9.noarch.rpm"
RPM_HASH = "8139f3c5385a065796d3340a655f0f3bb4cf5d3f9142bf20109a094554e2a84d44a2a5eb2cfce401f904f104ec023b86bec1694ce714b192446f5abb9c13e257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-machinelearningcompute \
python314-azure-mgmt-machinelearningcompute \
python3dist-azure-mgmt-machinelearningcompute"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-msrestazure >= 0.4.27 with python314-msrestazure < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
