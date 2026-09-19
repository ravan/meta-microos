SUMMARY = "Collection of In-Memory and Persistent (Disk-Based) Queues"
DESCRIPTION = "Queuelib is a Python library that implements object collections which are \
stored in memory or persisted to disk, provide a simple API, and run fast. \
 \
Queuelib provides collections for queues (FIFO), stacks (LIFO), queues sorted \
by priority and queues that are emptied in a round-robin fashion. Queuelib \
collections are not thread-safe."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python314-queuelib-1.10.0-1.1.noarch.rpm"
RPM_HASH = "5e1afb80634fcf634fdd82ef004fd47cc19d6586ccc9fa2c01bef0028f7d7f99f380ad5f5476cd1189880c0fa802cee0a35d73c80cd8752016a0c9b404ccce8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-queuelib \
python314-queuelib \
python3dist-queuelib"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
