SUMMARY = "Microsoft Azure Scheduler Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Scheduler Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python314-azure-mgmt-scheduler-7.0.0-1.5.noarch.rpm"
RPM_HASH = "f22608eda682ab5806b260e3a1061047e3c52405a8d0773f0f7072ee99935cc2b96779067de4796e0ee180564040d790dcbf0229ab595f4562362c39cf65543a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-scheduler \
python314-azure-mgmt-scheduler \
python3dist-azure-mgmt-scheduler"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-msrest >= 0.7.1 with python314-msrest < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
