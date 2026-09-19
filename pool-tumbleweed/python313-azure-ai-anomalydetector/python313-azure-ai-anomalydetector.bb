SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0b6"

RPM_NAME = "python313-azure-ai-anomalydetector-3.0.0b6-2.9.noarch.rpm"
RPM_HASH = "ca409c3361876d47ee4755e8cb2fb6a31b7b98cbe7ea60ca7092b7845f0b9644de724aee79834462c1f8ae10621768ff96abb9738ad428a0fdf6ba9f4fe652f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-anomalydetector \
python3.13dist-azure-ai-anomalydetector \
python313-azure-ai-anomalydetector \
python3dist-azure-ai-anomalydetector"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-ai-nspkg"

inherit rpm
