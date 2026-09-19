SUMMARY = "Microsoft Azure Secretsstoreextension Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Secretsstoreextension Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-secretsstoreextension-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "79d9088203d72106d07e33dfa20051f4530eed49475f5dbfe36754f367c7395f7c6cfcc14af6d8cf3db36b7bdbbdce0b636d067a1cd00d1fa55a23e03cabacab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-secretsstoreextension \
python3.13dist-azure-mgmt-secretsstoreextension \
python313-azure-mgmt-secretsstoreextension \
python3dist-azure-mgmt-secretsstoreextension"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
