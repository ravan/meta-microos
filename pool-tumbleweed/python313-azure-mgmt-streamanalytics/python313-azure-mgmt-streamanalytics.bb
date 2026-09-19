SUMMARY = "Microsoft Azure Stream Analytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Stream Analytics Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-streamanalytics-1.0.0.0-3.9.noarch.rpm"
RPM_HASH = "134410596118e4e5eee80fe20e295977fc5c51b4ace397c2ea6a5251884174ae6a56a4d253ae25afc8024e1d26505088715137f1745610e6dc484dd4764fb2f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-streamanalytics \
python3.13dist-azure-mgmt-streamanalytics \
python313-azure-mgmt-streamanalytics \
python3dist-azure-mgmt-streamanalytics"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
