SUMMARY = "Microsoft Azure Messaging Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Messaging namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.messaging namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-messaging-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "e5e203800d02f0a485fb19352c9150c93477d95640054897f8d9f677d4b45672156fdcf483591c91bed4f474c30228e0ec64fe46a74c0f4db5c5d3796a69dd9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-messaging-nspkg \
python3.13dist-azure-messaging-nspkg \
python313-azure-messaging-nspkg \
python3dist-azure-messaging-nspkg"

RDEPENDS:${PN} += "python313-azure-nspkg"

inherit rpm
