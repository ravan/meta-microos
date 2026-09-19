SUMMARY = "Microsoft Azure Resource Resource-Deploymentstacks Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Resource-Deploymentstacks Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-resource-deploymentstacks-1.0.0-1.3.noarch.rpm"
RPM_HASH = "952b8e612b40c5b7eed15f5cb7188b969b90ee81e41085c59724e87fa4fab38d837220114817fc85ffe3e87b47e7b22d71f607d53d19518714c8c068264505fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resource-deploymentstacks \
python3.13dist-azure-mgmt-resource-deploymentstacks \
python313-azure-mgmt-resource-deploymentstacks \
python3dist-azure-mgmt-resource-deploymentstacks"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-mgmt-resource \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
