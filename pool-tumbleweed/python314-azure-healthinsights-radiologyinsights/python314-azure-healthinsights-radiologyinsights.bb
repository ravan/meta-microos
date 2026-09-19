SUMMARY = "Microsoft Azure Health Insights Radiology Insights Client Library for Python"
DESCRIPTION = "Health Insights is an Azure Applied AI Service built with the Azure Cognitive \
Services Framework, that leverages multiple Cognitive Services, Healthcare API \
services and other Azure resources. \
 \
Radiology Insights is a model that aims to provide quality checks as feedback \
on errors and inconsistencies (mismatches) and ensures critical findings are \
identified and communicated using the full context of the report. Follow-up \
recommendations and clinical findings with measurements (sizes) documented by \
the radiologist are also identified."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-healthinsights-radiologyinsights-1.1.0-1.3.noarch.rpm"
RPM_HASH = "ccfe611e8eb06302684911b41845bc7c5c90e3245879f9e0d479a5560b385085867ae6cda83d3cc8d9b29e705e9de59cdc05c2f7d3c6b53eb1f341ebba6edd27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-healthinsights-radiologyinsights \
python314-azure-healthinsights-radiologyinsights \
python3dist-azure-healthinsights-radiologyinsights"

RDEPENDS:${PN} += "-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-core \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
