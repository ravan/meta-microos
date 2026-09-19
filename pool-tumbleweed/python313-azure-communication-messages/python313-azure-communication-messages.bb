SUMMARY = "Microsoft Communication Messages Client Library for Python"
DESCRIPTION = "his package contains a Python SDK for Azure Communication Services \
for Messages (Advanced Messaging)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-communication-messages-1.1.0-1.9.noarch.rpm"
RPM_HASH = "4b7c3736eed6a112b7704000e6309ca35d0921a381857a570c141ab7ba6e9f4b1ae287f608b58dad505163f98b2f1cf0050ff4e88cd51d84ede1526a0d8e2a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-messages \
python3.13dist-azure-communication-messages \
python313-azure-communication-messages \
python3dist-azure-communication-messages"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg"

inherit rpm
