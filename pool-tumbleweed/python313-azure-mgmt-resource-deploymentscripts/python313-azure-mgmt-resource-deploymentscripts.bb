SUMMARY = "Microsoft Azure Resource Resource-Deploymentscripts Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Resource-Deploymentscripts Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-resource-deploymentscripts-1.0.0~b1-2.3.noarch.rpm"
RPM_HASH = "fdcf23ed9f416cb56bb2b81b8cb3b9066e8044f7153b298063a94e1535851c55b6c0e576cb221372d160cc6dde778d643aa272c43145210bb34cea0750ede282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resource-deploymentscripts \
python3.13dist-azure-mgmt-resource-deploymentscripts \
python313-azure-mgmt-resource-deploymentscripts \
python3dist-azure-mgmt-resource-deploymentscripts"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-mgmt-resource \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
