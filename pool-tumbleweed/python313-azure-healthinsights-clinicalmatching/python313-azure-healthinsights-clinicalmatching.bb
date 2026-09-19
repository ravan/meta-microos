SUMMARY = "Microsoft Azure Health Insights Clinical Matching Client Library for Python"
DESCRIPTION = "Health Insights is an Azure Applied AI Service built with the Azure Cognitive \
Services Framework, that leverages multiple Cognitive Services, Healthcare API \
services and other Azure resources. The Clinical Matching model receives patients \
data and clinical trials protocols, and provides relevant clinical trials based \
on eligibility criteria."
LICENSE = "MIT"

PV = "1.0.0~b1.post1"

RPM_NAME = "python313-azure-healthinsights-clinicalmatching-1.0.0~b1.post1-2.8.noarch.rpm"
RPM_HASH = "7a4684d6b0293ebacc2b5e70cdce03c9ba02c2329db1a9813c536866d3cdcdcb05b755ce3867f1754621b6d6fa3617f82244c67e029d565fb3df873030b289cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-healthinsights-clinicalmatching \
python3.13dist-azure-healthinsights-clinicalmatching \
python313-azure-healthinsights-clinicalmatching \
python3dist-azure-healthinsights-clinicalmatching"

RDEPENDS:${PN} += "-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-core \
python313-azure-nspkg"

inherit rpm
