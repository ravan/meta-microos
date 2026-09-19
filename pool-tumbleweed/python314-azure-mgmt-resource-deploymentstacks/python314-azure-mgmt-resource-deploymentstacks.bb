SUMMARY = "Microsoft Azure Resource Resource-Deploymentstacks Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Resource-Deploymentstacks Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-resource-deploymentstacks-1.0.0-1.3.noarch.rpm"
RPM_HASH = "2bc140ecdf953adc5ee3d7a180622faca5713d781ea1f0df92948071ad20516407d572fb4f0b4d9838bba56983ddab8e431023b5ec2130c9686d5cb784503b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resource-deploymentstacks \
python314-azure-mgmt-resource-deploymentstacks \
python3dist-azure-mgmt-resource-deploymentstacks"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-mgmt-resource \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
