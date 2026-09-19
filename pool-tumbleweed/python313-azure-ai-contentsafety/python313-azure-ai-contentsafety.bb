SUMMARY = "Microsoft Azure AI Content Safety Client Library for Python"
DESCRIPTION = "Azure AI Content Safety detects harmful user-generated and AI-generated content in \
applications and services. Content Safety includes text and image APIs that allow \
you to detect material that is harmful."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-ai-contentsafety-1.0.0-2.9.noarch.rpm"
RPM_HASH = "1ffc6853f5302ca6a9aca889f490e9056ce972ef277a092d89fe19ed30388c13f2a88f922bd69f6991a93a38e3473113dc69d18710f9b081229a4eee0bc92cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-contentsafety \
python3.13dist-azure-ai-contentsafety \
python313-azure-ai-contentsafety \
python3dist-azure-ai-contentsafety"

RDEPENDS:${PN} += "-python313-azure-core >= 1.28.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-ai-nspkg"

inherit rpm
