SUMMARY = "Microsoft Azure Health Insights Clinical Matching Client Library for Python"
DESCRIPTION = "Health Insights is an Azure Applied AI Service built with the Azure Cognitive \
Services Framework, that leverages multiple Cognitive Services, Healthcare API \
services and other Azure resources. The Clinical Matching model receives patients \
data and clinical trials protocols, and provides relevant clinical trials based \
on eligibility criteria."
LICENSE = "MIT"

PV = "1.0.0~b1.post1"

RPM_NAME = "python314-azure-healthinsights-clinicalmatching-1.0.0~b1.post1-2.8.noarch.rpm"
RPM_HASH = "b75999a689e8714f161a55650cecc1da171ae2064f4f43513306ae4f5b88757921b9d13e0219f56783f9dcfe0d930787b3b6b7057063aad5d23d56d1efb29b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-healthinsights-clinicalmatching \
python314-azure-healthinsights-clinicalmatching \
python3dist-azure-healthinsights-clinicalmatching"

RDEPENDS:${PN} += "-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-core \
python314-azure-nspkg"

inherit rpm
