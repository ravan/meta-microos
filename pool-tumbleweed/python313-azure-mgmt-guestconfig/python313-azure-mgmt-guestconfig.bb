SUMMARY = "Microsoft Azure Guestconfig Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Guestconfig Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python313-azure-mgmt-guestconfig-1.0.0b3-1.1.noarch.rpm"
RPM_HASH = "11dad0a3bcbdf363c2f426e3c3703ff0a3d0e03d00fa3b5723be477fa281c46bab3b9ebadd9a53df4b67958e1c90145cb7927510fb4ed59a20315b3527a3fe82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-guestconfig \
python3.13dist-azure-mgmt-guestconfig \
python313-azure-mgmt-guestconfig \
python3dist-azure-mgmt-guestconfig"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
