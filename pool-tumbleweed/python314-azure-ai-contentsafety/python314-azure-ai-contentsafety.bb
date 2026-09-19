SUMMARY = "Microsoft Azure AI Content Safety Client Library for Python"
DESCRIPTION = "Azure AI Content Safety detects harmful user-generated and AI-generated content in \
applications and services. Content Safety includes text and image APIs that allow \
you to detect material that is harmful."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-ai-contentsafety-1.0.0-2.9.noarch.rpm"
RPM_HASH = "c83f5ac70051f09395ff2adc804f688f873bf57c4927555f0bc292237b16f17ca3ea4ab9771c822a0642616edd69337891394c6acd6986a6f0eefa16c024378d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-contentsafety \
python314-azure-ai-contentsafety \
python3dist-azure-ai-contentsafety"

RDEPENDS:${PN} += "-python314-azure-core >= 1.28.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-ai-nspkg"

inherit rpm
