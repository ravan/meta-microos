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

RPM_NAME = "python314-azure-eventhub-checkpointstoreblob-aio-1.2.0-1.6.noarch.rpm"
RPM_HASH = "2c76b97acc5799406a85b02b55f594276dce0b1fe4133655290f62e933455fa5e688164b7428a9907c5de63e95952c02e6e9c9096ee81a6738e3bd870527ac5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-eventhub-checkpointstoreblob-aio \
python314-azure-eventhub-checkpointstoreblob-aio \
python3dist-azure-eventhub-checkpointstoreblob-aio"

RDEPENDS:${PN} += "-python314-aiohttp >= 3.8.3 with python314-aiohttp < 4.0 \
-python314-azure-eventhub >= 5.0.0 with python314-azure-eventhub < 6.0.0 \
-python314-azure-storage-blob >= 12.0.0 with python314-azure-storage-blob < 13.0.0 \
python-abi \
python314-azure-nspkg"

inherit rpm
