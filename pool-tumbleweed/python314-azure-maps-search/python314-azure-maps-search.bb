SUMMARY = "Microsoft Azure Maps Search Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Search."
LICENSE = "MIT"

PV = "2.0.0~b2"

RPM_NAME = "python314-azure-maps-search-2.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "0d1f5210b9b55c685bc411459db787dac9c66e96faa18e1c289ee56635566c528a876c8e211351d6127aefb985cbbac5fdf14f75b471583f75ab0d688c2591a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-maps-search \
python314-azure-maps-search \
python3dist-azure-maps-search"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-msrest"

inherit rpm
