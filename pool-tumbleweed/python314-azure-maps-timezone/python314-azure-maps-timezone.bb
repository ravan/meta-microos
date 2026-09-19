SUMMARY = "Microsoft Azure Maps Timezone Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Timezone."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-maps-timezone-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "f16f9c0ecdf9d765f87b7e3236f5298ba91410e3f2b723fdc44560b1fff476f0fd1cef26395d7d138501b570a8b36bf1c779db32697657384d93a01a1d9673eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-maps-timezone \
python314-azure-maps-timezone \
python3dist-azure-maps-timezone"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-msrest \
python314-requests"

inherit rpm
