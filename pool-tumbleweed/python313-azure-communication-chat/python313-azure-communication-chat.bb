SUMMARY = "Microsoft Azure Communication Chat Service Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Chat."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-azure-communication-chat-1.3.0-1.9.noarch.rpm"
RPM_HASH = "bf21c78dafc664900e521ba101aba822ec4803cac872ca2089129560c25a8814516258cae453d4270c87a797a8efee0c0b132692020d32b967699df9722bbb06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-chat \
python3.13dist-azure-communication-chat \
python313-azure-communication-chat \
python3dist-azure-communication-chat"

RDEPENDS:${PN} += "-python313-azure-core >= 1.29.5 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg \
python313-six"

inherit rpm
