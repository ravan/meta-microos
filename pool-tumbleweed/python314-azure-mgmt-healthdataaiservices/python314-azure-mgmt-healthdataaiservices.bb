SUMMARY = "Microsoft Azure Healthdataaiservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Healthdataaiservices Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-healthdataaiservices-1.0.0-1.8.noarch.rpm"
RPM_HASH = "791f9da80d58d41ef03804785bc980c0a10d4246115109723e6be2bd5909b10b56af145f81748ca9e2a0ba89ed1c68b474a08cf920506dd302698725c299aebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-healthdataaiservices \
python314-azure-mgmt-healthdataaiservices \
python3dist-azure-mgmt-healthdataaiservices"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
