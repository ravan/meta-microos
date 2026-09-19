SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python314-azure-cognitiveservices-anomalydetector-0.3.1-1.9.noarch.rpm"
RPM_HASH = "04a7dc466e7c08706809e668359031900f8fde4e0043df1d41248fc96d5e459bb10f634c5c94f99ea04f0f83d75503ffcb2076eacb1e0f2f34c65c4d3ba18505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-cognitiveservices-anomalydetector \
python314-azure-cognitiveservices-anomalydetector \
python3dist-azure-cognitiveservices-anomalydetector"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.1 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-cognitiveservices-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
