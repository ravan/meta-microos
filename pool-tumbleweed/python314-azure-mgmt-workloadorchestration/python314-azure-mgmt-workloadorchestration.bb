SUMMARY = "Microsoft Azure Workloadorchestration Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadorchestration Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-workloadorchestration-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "8d3aba082fb039cdee162ff27c1956764ff41801422b80ee05a363f70d10739e9f824c6408f24c4780b944cf08f2bcacdced68fba0138bf8ce8863832dfbde25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-workloadorchestration \
python314-azure-mgmt-workloadorchestration \
python3dist-azure-mgmt-workloadorchestration"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
