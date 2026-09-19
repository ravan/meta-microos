SUMMARY = "A heap with decrease-key and increase-key operations"
DESCRIPTION = "HeapDict implements the MutableMapping ABC, meaning it works pretty \
much like a regular Python dict.  It's designed to be used as a \
priority queue. \
 \
Unlike the Python standard library's heapq module, the HeapDict \
supports efficiently changing the priority of an existing object \
(often called 'decrease-key' in textbooks).  Altering the priority is \
important for many algorithms such as Dijkstra's Algorithm and A*."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python314-HeapDict-1.0.1-4.5.noarch.rpm"
RPM_HASH = "82f306953040691b33843f948d4f8c379bd992a3ca3f65b081ca2a7db4b35f8df1b702edde68fa87f4da1e2aa5473f6300af3980eddb58d9b80d6c89399ec08f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-heapdict \
python314-HeapDict \
python3dist-heapdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
