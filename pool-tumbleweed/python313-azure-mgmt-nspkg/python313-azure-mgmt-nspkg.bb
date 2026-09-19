SUMMARY = "Microsoft Azure Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python313-azure-mgmt-nspkg-3.0.2-5.9.noarch.rpm"
RPM_HASH = "84832f4caf64442d90e1ee15b3fd9310805c8db0f6a41f8cfdf216948e485288fa4ab07707bb5930559c7e1509c273624453e82875f51d5cec53b258e1e95158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-nspkg \
python3.13dist-azure-mgmt-nspkg \
python313-azure-mgmt-nspkg \
python3dist-azure-mgmt-nspkg"

RDEPENDS:${PN} += "python313-azure-nspkg"

inherit rpm
