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

RPM_NAME = "python313-azure-healthinsights-radiologyinsights-1.1.0-1.3.noarch.rpm"
RPM_HASH = "6ab8d9a17ee06c518f5759d79be95863b5d954d2965a67ba8e594658ce6ae1ac5341cab2599f5f408bd8b8fdfb1f1fffbecec0cbf5cc7b4372d484227c3564e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-healthinsights-radiologyinsights \
python3.13dist-azure-healthinsights-radiologyinsights \
python313-azure-healthinsights-radiologyinsights \
python3dist-azure-healthinsights-radiologyinsights"

RDEPENDS:${PN} += "-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-core \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
