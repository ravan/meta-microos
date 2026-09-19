SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0b6"

RPM_NAME = "python314-azure-ai-anomalydetector-3.0.0b6-2.9.noarch.rpm"
RPM_HASH = "bde9105616af30d6e6563ce13752cbbda93306e279f2823a34cf87e7484f5432c20187cc7acef472c59ea05455aa71f2aa781cda713c4d4522562d1a9e1cadb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-anomalydetector \
python314-azure-ai-anomalydetector \
python3dist-azure-ai-anomalydetector"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-ai-nspkg"

inherit rpm
