SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python313-azure-cognitiveservices-anomalydetector-0.3.1-1.9.noarch.rpm"
RPM_HASH = "d326b51a780bc0060b887a4a662419dd3e4ec16aafe828fac1d786100c0a5c44cbd1d6989cee86c6f62c2449729982b1091eb309bb8b05c2fd33d6f746db14ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-anomalydetector \
python3.13dist-azure-cognitiveservices-anomalydetector \
python313-azure-cognitiveservices-anomalydetector \
python3dist-azure-cognitiveservices-anomalydetector"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.1 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-cognitiveservices-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
