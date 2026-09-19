SUMMARY = "Azure Maps Route Package client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Route."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python313-azure-maps-route-1.0.0~b3-1.8.noarch.rpm"
RPM_HASH = "0e06ff2c18f8852fb62f79ef5960dabf5de5dc9764fc4f8ef17f7518a6288184cac33bfcd17a6884fba256ed08e6dfe2b0769f2b5abbeb069b8c03ee84b240df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-maps-route \
python3.13dist-azure-maps-route \
python313-azure-maps-route \
python3dist-azure-maps-route"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-msrest \
python313-requests"

inherit rpm
