SUMMARY = "Microsoft Azure Workloadmonitor Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadmonitor Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python314-azure-mgmt-workloadmonitor-1.0.0~b4-2.9.noarch.rpm"
RPM_HASH = "dc27cbdcf5a1b9a5db4dd5c0f0a9c2954427bd508e7d8f5808febf22a2312fe6c975923a11186d05121eceb80bd6798d8a5a5e15f9b0ecba677496727b73688e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-workloadmonitor \
python314-azure-mgmt-workloadmonitor \
python3dist-azure-mgmt-workloadmonitor"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
