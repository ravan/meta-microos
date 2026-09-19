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

RPM_NAME = "python314-azure-eventhub-checkpointstoreblob-1.2.0-1.6.noarch.rpm"
RPM_HASH = "0a3b5055ffab98b3538539f955beb20fc973c7287ad5580aada11d1346023eb970bb90adb757240602e30e3e780b8211cfe6800715beb4464c7450f92d9b9718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-eventhub-checkpointstoreblob \
python314-azure-eventhub-checkpointstoreblob \
python3dist-azure-eventhub-checkpointstoreblob"

RDEPENDS:${PN} += "-python314-azure-eventhub >= 5.0.0 with python314-azure-eventhub < 6.0.0 \
-python314-azure-storage-blob >= 12.0.0 with python314-azure-storage-blob < 13.0.0 \
python-abi \
python314-azure-nspkg"

inherit rpm
