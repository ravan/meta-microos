SUMMARY = "Microsoft Azure Dataprotection Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dataprotection Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-azure-mgmt-dataprotection-2.2.0-1.1.noarch.rpm"
RPM_HASH = "ac121592233f73fbcc5a9fff59134c518c0a839c7a77301883245288616af3db17b6420820e3053120757bf0f1178f69393bdd5d94731218d869e93c8b4e5751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dataprotection \
python3.13dist-azure-mgmt-dataprotection \
python313-azure-mgmt-dataprotection \
python3dist-azure-mgmt-dataprotection"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
