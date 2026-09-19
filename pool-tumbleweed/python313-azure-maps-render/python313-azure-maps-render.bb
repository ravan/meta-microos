SUMMARY = "Microsoft Azure Maps Render Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Render."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-maps-render-1.0.0~b2-2.9.noarch.rpm"
RPM_HASH = "d7d0d9b9dc2e311b8799d4a2f8db161837f54886e0fca39c1d48ca377413a1e62f95f0c10c50f81fb4e2d630dc317a31cd4d56163afe6fd2b796c72b08832771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-maps-render \
python3.13dist-azure-maps-render \
python313-azure-maps-render \
python3dist-azure-maps-render"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-msrest \
python313-requests"

inherit rpm
