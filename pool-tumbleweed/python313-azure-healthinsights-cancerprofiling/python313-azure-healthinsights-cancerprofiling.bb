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

RPM_NAME = "python313-azure-healthinsights-cancerprofiling-1.0.0~b1.post1-2.8.noarch.rpm"
RPM_HASH = "71bcded5df3432ebfd73a34fcb5c29ca4e51ffc1d4d354a3f01871e9aff1e97fe1ac9d7d35f00ccd3080491d1986d35c00f7592be397dd31c4c9168c98370290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-healthinsights-cancerprofiling \
python3.13dist-azure-healthinsights-cancerprofiling \
python313-azure-healthinsights-cancerprofiling \
python3dist-azure-healthinsights-cancerprofiling"

RDEPENDS:${PN} += "-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-core \
python313-azure-nspkg"

inherit rpm
