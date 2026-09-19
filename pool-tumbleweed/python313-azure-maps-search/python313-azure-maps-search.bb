SUMMARY = "Microsoft Azure Maps Search Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Search."
LICENSE = "MIT"

PV = "2.0.0~b2"

RPM_NAME = "python313-azure-maps-search-2.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "20388ff6c551d5a10ac3213de09ce9b4f5ce39f7b30f98e783e5f035bf7dbb10968d459cae824ec34de76522749805311df8c543e6f7b6fd756711a0995704c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-maps-search \
python3.13dist-azure-maps-search \
python313-azure-maps-search \
python3dist-azure-maps-search"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-msrest"

inherit rpm
