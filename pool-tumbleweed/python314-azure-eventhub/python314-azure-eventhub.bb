SUMMARY = "Azure Event Hubs client library for Python"
DESCRIPTION = "Azure Event Hubs is a highly scalable publish-subscribe service that can ingest millions \
of events per second and stream them to multiple consumers. This lets you process and \
analyze the massive amounts of data produced by your connected devices and applications. \
Once Event Hubs has collected the data, you can retrieve, transform, and store it by using \
any real-time analytics provider or with batching/storage adapters. If you would like to \
know more about Azure Event Hubs, you may wish to review: \
[What is Event Hubs](https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-about)? \
 \
The Azure Event Hubs client library allows for publishing and consuming of Azure Event \
Hubs events and may be used to: \
 \
 - Emit telemetry about your application for business intelligence and diagnostic purposes. \
 - Publish facts about the state of your application which interested parties may observe \
   and use as a trigger for taking action. \
 - Observe interesting operations and interactions happening within your business or other \
   ecosystem, allowing loosely coupled systems to interact without the need to bind them together. \
 - Receive events from one or more publishers, transform them to better meet the needs of \
   your ecosystem, then publish the transformed events to a new stream for consumers to observe."
LICENSE = "MIT"

PV = "5.15.1"

RPM_NAME = "python314-azure-eventhub-5.15.1-1.4.noarch.rpm"
RPM_HASH = "a042bd933e9e3fbe60dd7923f78d22c93719eb07a170d60170989ed01cb8e00a05c2edf8662d4cb8f8f06cd3688c89eafe6cdea42ac6652f306936f5efc9810b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-eventhub \
python314-azure-eventhub \
python3dist-azure-eventhub"

RDEPENDS:${PN} += "-python314-azure-core >= 1.27.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
