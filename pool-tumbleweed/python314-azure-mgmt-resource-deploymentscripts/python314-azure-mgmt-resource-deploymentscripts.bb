SUMMARY = "Microsoft Azure Resource Resource-Deploymentscripts Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Resource-Deploymentscripts Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-resource-deploymentscripts-1.0.0~b1-2.3.noarch.rpm"
RPM_HASH = "da0b786b112bee366346edbb0af0a6dc1cd5b198de6f53f1079dc84a1427871acc99c568d22b9da0746ebb59435f2b0db4f5fe971bc687d94629db46aca3a030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resource-deploymentscripts \
python314-azure-mgmt-resource-deploymentscripts \
python3dist-azure-mgmt-resource-deploymentscripts"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-mgmt-resource \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
