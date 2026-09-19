SUMMARY = "Azure EventHubs Checkpoint Store client library for Python using Storage Blobs"
DESCRIPTION = "Azure EventHubs Checkpoint Store is used for storing checkpoints while processing events \
from Azure Event Hubs. This Checkpoint Store package works as a plug-in package to \
EventHubConsumerClient. It uses Azure Storage Blob as the persistent store for maintaining \
checkpoints and partition ownership information. \
 \
Please note that this is a sync library, for async version of the Azure EventHubs Checkpoint \
Store client library, please refer to the package azure-eventhub-checkpointstoreblob-aio."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-azure-eventhub-checkpointstoreblob-1.2.0-1.6.noarch.rpm"
RPM_HASH = "a1e6bc0eb67bb9de3de1c5a3f1f55b4e1d7f2ec4bf6f959b0a821b2e4c473a745b380d490442cef525084efb1677c07c43b1055a3112e3f928cbcd337a08700d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventhub-checkpointstoreblob \
python3.13dist-azure-eventhub-checkpointstoreblob \
python313-azure-eventhub-checkpointstoreblob \
python3dist-azure-eventhub-checkpointstoreblob"

RDEPENDS:${PN} += "-python313-azure-eventhub >= 5.0.0 with python313-azure-eventhub < 6.0.0 \
-python313-azure-storage-blob >= 12.0.0 with python313-azure-storage-blob < 13.0.0 \
python-abi \
python313-azure-nspkg"

inherit rpm
