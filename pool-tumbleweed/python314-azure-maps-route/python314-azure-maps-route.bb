SUMMARY = "Azure Maps Route Package client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Route."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python314-azure-maps-route-1.0.0~b3-1.8.noarch.rpm"
RPM_HASH = "62422749d7c03fa687e131b24f2ca4c4dbbcad3b62dbf809243cabbb9acc5d9699837c1579f7b5ca943a809bc3b04332b1c7040df0c5a9b5611d406e90970730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-maps-route \
python314-azure-maps-route \
python3dist-azure-maps-route"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-msrest \
python314-requests"

inherit rpm
