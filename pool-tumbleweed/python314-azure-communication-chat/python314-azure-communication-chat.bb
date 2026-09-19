SUMMARY = "Microsoft Azure Communication Chat Service Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Chat."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-azure-communication-chat-1.3.0-1.9.noarch.rpm"
RPM_HASH = "296f8a698eacebb1bda785d833821b0c356a63816f8587595c91ccf50c16727d6690efc6d5ec4dc3c637b95fa9ba6df97b096e9bb7f8dfc1d319fac06a9e687a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-chat \
python314-azure-communication-chat \
python3dist-azure-communication-chat"

RDEPENDS:${PN} += "-python314-azure-core >= 1.29.5 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg \
python314-six"

inherit rpm
