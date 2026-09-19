SUMMARY = "Microsoft Azure Advisor Client Library"
DESCRIPTION = "This is the Microsoft Azure Advisor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.1"

RPM_NAME = "python313-azure-mgmt-advisor-9.0.1-1.2.noarch.rpm"
RPM_HASH = "1fdfaba7f1ad27d1c41a1937913518e87649e96ef39b20300e081f44fd2911588df6f0d4018e3ccdb9dd21b0448c234888b0aa11548326f391cea508ad0a19d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-advisor \
python3.13dist-azure-mgmt-advisor \
python313-azure-mgmt-advisor \
python3dist-azure-mgmt-advisor"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
