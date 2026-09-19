SUMMARY = "Microsoft Azure Workloadorchestration Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Workloadorchestration Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-workloadorchestration-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "4a690c1406272b673bad59a2fc93a85a7636ef97d918570431d0fd626d834eb364c8bd209caf19834140bdf64c3f7230043c9d862c3581b2e8cd87a65f1af413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-workloadorchestration \
python3.13dist-azure-mgmt-workloadorchestration \
python313-azure-mgmt-workloadorchestration \
python3dist-azure-mgmt-workloadorchestration"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
