SUMMARY = "Microsoft Azure Communication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Communication Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-mgmt-communication-3.0.0-1.1.noarch.rpm"
RPM_HASH = "7c90c98f1b12039c0b8e87b6a89abe3f02a3b76c6460356201fd8d5bb465d8f4060f63392cc6934e1fea895ce2bb60aa315b32884723755c61c8821e5e9396c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-communication \
python3.13dist-azure-mgmt-communication \
python313-azure-mgmt-communication \
python3dist-azure-mgmt-communication"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
