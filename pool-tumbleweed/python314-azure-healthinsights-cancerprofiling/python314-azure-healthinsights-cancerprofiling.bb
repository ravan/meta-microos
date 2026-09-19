SUMMARY = "Microsoft Azure Health Insights Cancer Profiling Client Library for Python"
DESCRIPTION = "Health Insights is an Azure Applied AI Service built with the Azure Cognitive \
Services Framework, that leverages multiple Cognitive Services, Healthcare API \
services and other Azure resources. \
 \
The Cancer Profiling model receives clinical records of oncology patients and \
outputs cancer staging, such as clinical stage TNM categories and pathologic \
stage TNM categories as well as tumor site, histology."
LICENSE = "MIT"

PV = "1.0.0~b1.post1"

RPM_NAME = "python314-azure-healthinsights-cancerprofiling-1.0.0~b1.post1-2.8.noarch.rpm"
RPM_HASH = "6f34274201ad100a922faf5cea83386f17ca5fa25781d921971befb1e289cee53e634d11fc90a1d8b13945eb22ff2895841c11f817cc81f81589426d6260f44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-healthinsights-cancerprofiling \
python314-azure-healthinsights-cancerprofiling \
python3dist-azure-healthinsights-cancerprofiling"

RDEPENDS:${PN} += "-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-core \
python314-azure-nspkg"

inherit rpm
