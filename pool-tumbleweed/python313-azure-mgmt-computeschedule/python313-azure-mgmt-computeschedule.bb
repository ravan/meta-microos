SUMMARY = "Microsoft Azure Computeschedule Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computeschedule Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-computeschedule-1.1.0-1.5.noarch.rpm"
RPM_HASH = "4d3bdd44527d396866886356a7328b73ea5edf1dc878678bbfc54807ebe6dc6d99aba149514854f3065574efc12eb20c61d68adea7a02fe6b6a54a787ab96d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-computeschedule \
python3.13dist-azure-mgmt-computeschedule \
python313-azure-mgmt-computeschedule \
python3dist-azure-mgmt-computeschedule"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
