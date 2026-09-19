SUMMARY = "Microsoft Azure Service Fabric Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0.0"

RPM_NAME = "python313-azure-servicefabric-8.2.0.0-3.9.noarch.rpm"
RPM_HASH = "497a6fb63744534abda7b2c7c62c9f3eb9dedfde7cc21e7488cdb6bb94f3a5bcb398adda5a870303d20252a993a2e21dac6770f6ab3b51de19ad9c7f7b7b9df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicefabric \
python3.13dist-azure-servicefabric \
python313-azure-servicefabric \
python3dist-azure-servicefabric"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-msrest"

inherit rpm
