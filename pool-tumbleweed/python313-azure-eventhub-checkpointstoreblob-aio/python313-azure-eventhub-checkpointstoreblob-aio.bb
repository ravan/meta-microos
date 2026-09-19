SUMMARY = "Azure EventHubs Checkpoint Store client library for Python using Storage Blobs"
DESCRIPTION = "Azure EventHubs Checkpoint Store is used for storing checkpoints while processing events \
from Azure Event Hubs. This Checkpoint Store package works as a plug-in package to \
EventHubConsumerClient. It uses Azure Storage Blob as the persistent store for maintaining \
checkpoints and partition ownership information. \
 \
Please note that this is an async library, for sync version of the Azure EventHubs Checkpoint \
Store client library, please refer to the package azure-eventhub-checkpointstoreblob."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-azure-eventhub-checkpointstoreblob-aio-1.2.0-1.6.noarch.rpm"
RPM_HASH = "32c28fe47cfcaa2fb162ce763921b6bf5a5ff705ec2ce26ceee4c465b2c2f95f4b624b7c1d68279896f28e002e822fb325e27a4afb7c516ddcae2aff8569e4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventhub-checkpointstoreblob-aio \
python3.13dist-azure-eventhub-checkpointstoreblob-aio \
python313-azure-eventhub-checkpointstoreblob-aio \
python3dist-azure-eventhub-checkpointstoreblob-aio"

RDEPENDS:${PN} += "-python313-aiohttp >= 3.8.3 with python313-aiohttp < 4.0 \
-python313-azure-eventhub >= 5.0.0 with python313-azure-eventhub < 6.0.0 \
-python313-azure-storage-blob >= 12.0.0 with python313-azure-storage-blob < 13.0.0 \
python-abi \
python313-azure-nspkg"

inherit rpm
