SUMMARY = "Microsoft Azure PowerBIDedicated Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure PowerBIDedicated Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-powerbidedicated-2.0.0-1.1.noarch.rpm"
RPM_HASH = "02973f88a8650f173b1c32ca4d4187e14e4fffb87a9de667ae3be832837732a7860e1fbdd3754005aff146e38fc6eeffc46230b8e9edef5fadeef38760dd7b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-powerbidedicated \
python3.13dist-azure-mgmt-powerbidedicated \
python313-azure-mgmt-powerbidedicated \
python3dist-azure-mgmt-powerbidedicated"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
