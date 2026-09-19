SUMMARY = "Collection of In-Memory and Persistent (Disk-Based) Queues"
DESCRIPTION = "Queuelib is a Python library that implements object collections which are \
stored in memory or persisted to disk, provide a simple API, and run fast. \
 \
Queuelib provides collections for queues (FIFO), stacks (LIFO), queues sorted \
by priority and queues that are emptied in a round-robin fashion. Queuelib \
collections are not thread-safe."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python313-queuelib-1.10.0-1.1.noarch.rpm"
RPM_HASH = "2e39e3aec5ff656d80e4724df3ff280041038edf530c099d5f80b0901d1bb72aa72d508458c1fbde7f07f467a5447b9e2469ffab887b9436859df33fb956ff98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-queuelib \
python3.13dist-queuelib \
python313-queuelib \
python3dist-queuelib"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
