SUMMARY = "Microsoft Azure Maps Timezone Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Timezone."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-maps-timezone-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "50e86ab971cbadf099308047ad04d493bb666ea289f784126ab783bb79c5651ebf571c37f2cdc4a3f352cc5d627890c26d393d38c3f3d48b607e5e58626aa4b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-maps-timezone \
python3.13dist-azure-maps-timezone \
python313-azure-maps-timezone \
python3dist-azure-maps-timezone"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-msrest \
python313-requests"

inherit rpm
