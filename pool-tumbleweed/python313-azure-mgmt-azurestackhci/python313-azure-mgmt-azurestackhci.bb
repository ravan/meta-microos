SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "8.1.0"

RPM_NAME = "python313-azure-mgmt-azurestackhci-8.1.0-1.1.noarch.rpm"
RPM_HASH = "41974c1bacf09b91721ef0b7a617608ef5345f458bfbef227654bf731a9aaa6f0595f03c6bc84978e9285216e4cfd9b8f8e73801cb71cb39c7ced7d5cf097c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurestackhci \
python3.13dist-azure-mgmt-azurestackhci \
python313-azure-mgmt-azurestackhci \
python3dist-azure-mgmt-azurestackhci"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
