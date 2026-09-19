SUMMARY = "Microsoft Azure CLI Telemetry Package"
DESCRIPTION = "Microsoft Azure CLI Telemetry Package \
 \
This is the Microsoft Azure CLI Telemetry package. It is not intended to be installed directly by the end user. \
 \
This package includes: \
1. Support API for Azure CLI to gather telemetry. \
2. Telemetry upload process."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "azure-cli-telemetry-1.1.0-5.4.noarch.rpm"
RPM_HASH = "975ce15daf27410ff4c293f26a83f0c0caea88c979c1ffee66f7247ad95ce307ad90223b06d379aeee0d3d48f57b36c3ca10859d32046bdb99db0db7371cf43e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azure-cli-telemetry \
python3.13dist-azure-cli-telemetry \
python3dist-azure-cli-telemetry"

RDEPENDS:${PN} += "azure-cli-core \
python-abi \
python313-applicationinsights \
python313-azure-nspkg \
python313-portalocker"

inherit rpm
